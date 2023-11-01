import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String agencia;
    private String numeroConta;
    protected double saldo;
    private Cliente cliente;
    // extrado deve ter um tipo específico, ter uma classe pra representar uma transação
    private List<String> extrato;

    public Conta(String agencia, String numeroConta, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.extrato = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        extrato.add("Depósito:" + valor);
        Notificacao notificacao = new Notificacao();
        notificacao.enviarNotificacao(cliente, "Você realizou um depósito de " + valor);
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            extrato.add("Saque: " + valor);
            Notificacao notificacao = new Notificacao();
            notificacao.enviarNotificacao(cliente, "Você realizou um saque de " + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
            extrato.add(
                    "Transferência: -" + valor + " para conta " + contaDestino.getNumeroConta());
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }

    public void exibirExtrato() {
        for (String transacao : extrato) {
            System.out.println(transacao);
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }
}
