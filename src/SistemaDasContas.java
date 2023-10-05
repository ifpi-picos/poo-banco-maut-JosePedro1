public class SistemaDasContas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("José Pedro", "123.456.789-00", "18/11/2005", "Rua A, 123");
        Conta conta1 = new Conta("001", "12345-6", 1000.0, cliente);
        Conta conta2 = new Conta("001", "54321-0", 2000.0, cliente);

        cliente.abrirConta(conta1);
        cliente.abrirConta(conta2);

        conta1.depositar(500.0);
        conta1.sacar(200.0);
        conta2.transferir(conta1, 100.0);

        conta2.depositar(200.0);
        conta2.sacar(300.0);
        conta1.transferir(conta2, 30.0);

System.out.println("Extrato da conta "+ conta1.getNumeroConta());
        conta1.exibirExtrato();
        System.out.println("\nExtrato da conta "+ conta2.getNumeroConta());
        conta2.exibirExtrato();
    }
}
