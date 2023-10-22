import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private List<Conta> contas;

      public Cliente(String nome, String cpf, String dataNascimento, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contas = new ArrayList<>();
}
public String getNome() {
  return nome;
}

public String getCpf() {
  return cpf;
}

public List<Conta> getContas() {
  return contas;
}

public void abrirConta(Conta conta) {
  contas.add(conta);
}
public ContaCorrente abrirContaCorrente(String agencia, String numeroConta, double saldo, double limiteChequeEspecial) {
  ContaCorrente conta = new ContaCorrente(agencia, numeroConta, saldo, this, limiteChequeEspecial);
  contas.add(conta);
  return conta;
}
public ContaPoupanca abrirContaPoupanca(String agencia, String numeroConta, double saldo, double rendimento) {
  ContaPoupanca conta = new ContaPoupanca(agencia, numeroConta, saldo, this, rendimento);
  contas.add(conta);
  return conta;
}
}