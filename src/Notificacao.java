public class Notificacao {
    public void enviarNotificacao(Cliente cliente, String mensagem) {
        System.out.println("Notificação para: " + cliente.getNome());
        System.out.println("Mensagem: "+ mensagem);
System.out.println();
}
}