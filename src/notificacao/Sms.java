package notificacao;

public class Sms implements Notificacao {
    @Override
    public void enviarNotificacao(String op, double valor){
        System.out.println("Notificação enviada por SMS" + op + "Valor: $" + valor);
    }
}
