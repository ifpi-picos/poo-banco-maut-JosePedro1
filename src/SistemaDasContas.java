public class SistemaDasContas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("José Pedro", "123.456.789-00", "18/11/2005", "Rua A, 123");
        ContaCorrente contaCorrente = cliente.abrirContaCorrente("001", "12345-6", 100.0, 500.0);
        ContaPoupanca contaPoupanca = cliente.abrirContaPoupanca("001", "54321-0", 100.0, 0.10);

        contaCorrente.depositar(100.0);
        contaCorrente.sacar(100.0);
        contaCorrente.exibirExtrato();
        contaCorrente.transferir(contaPoupanca, 20.0);
        contaCorrente.transferir(contaPoupanca, 20.0);
        contaCorrente.transferir(contaPoupanca, 20.0);
        contaCorrente.transferir(contaPoupanca, 20.0);
        contaCorrente.transferir(contaPoupanca, 20.0);
        contaCorrente.exibirExtrato();

        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.depositar(100.0); // não está adicionando o rendimento
        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.sacar(100.0);
        contaPoupanca.exibirExtrato(); // deveria exibir o valor do saldo atual também
        System.out.println(contaPoupanca.getSaldo());
    }

}
