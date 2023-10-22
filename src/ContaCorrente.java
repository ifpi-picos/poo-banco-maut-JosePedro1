public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
    private int transferenciasGratis;

 public ContaCorrente(String agencia, String numeroConta, double saldo, Cliente cliente, double limiteChequeEspecial) {
        super(agencia, numeroConta, saldo, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.transferenciasGratis = 2;
    }
 public void transferir(Conta contaDestino, double valor) {
        if (transferenciasGratis > 0) {
            super.transferir(contaDestino, valor);
            transferenciasGratis--;
        } else {
            double taxa = valor * 0.10; // 10% de taxa
            if (saldo + limiteChequeEspecial >= valor + taxa) {
                super.transferir(contaDestino, valor + taxa);
            } else {
                System.out.println("Saldo e limite de cheque especial insuficientes para a transferência.");
            }
        }
    }
}