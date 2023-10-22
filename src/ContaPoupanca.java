public class ContaPoupanca extends Conta {
        private double taxaTransferencia;
        private double taxaSaque;
        private double rendimento;
    
        public ContaPoupanca(String agencia, String numeroConta, double saldo, Cliente cliente, double rendimento) {
            super(agencia, numeroConta, saldo, cliente);
            this.taxaTransferencia = 0.10; 
            this.taxaSaque = 0.05; 
            this.rendimento = rendimento;
        }
    
 public void transferir(Conta contaDestino, double valor) {
        double taxa = valor * taxaTransferencia;
        if (saldo >= valor + taxa) {
            super.transferir(contaDestino, valor + taxa);
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }
public void sacar(double valor) {
        double taxa = valor * taxaSaque;
        if (saldo >= valor + taxa) {
            super.sacar(valor + taxa);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
}