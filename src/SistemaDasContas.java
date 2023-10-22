public class SistemaDasContas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("José Pedro", "123.456.789-00", "18/11/2005", "Rua A, 123");
        ContaCorrente contaCorrente = cliente.abrirContaCorrente("001", "12345-6", 1000.0, 500.0);
        ContaPoupanca contaPoupanca = cliente.abrirContaPoupanca("001", "54321-0", 2000.0, 0.10);

        contaCorrente.depositar(500.0);
        contaCorrente.sacar(200.0);
        contaPoupanca.transferir(contaCorrente, 100.0);

        contaPoupanca.depositar(200.0);
        contaPoupanca.sacar(300.0);
        contaCorrente.transferir(contaPoupanca, 30.0);

   System.out.println("Extrato da conta corrente " + contaCorrente.getNumeroConta());
        contaCorrente.exibirExtrato();
        System.out.println("\nExtrato da conta poupança " + contaPoupanca.getNumeroConta());
        contaPoupanca.exibirExtrato();
    }
}
