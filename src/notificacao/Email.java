package notificacao;

public class Email implements Notificacao {
    @Override
    public void enviarNotificacao(String op, double valor){
        System.out.println("Notificação enviada por email " + op + "Valor: $" + valor);
    }
}
