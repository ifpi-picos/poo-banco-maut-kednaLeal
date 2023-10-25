import notificacao.Notificacao;

public class ContaPoupanca extends Conta {
    private double rendimento = 0.05;
    private double taxa = 0.10;

    public ContaPoupanca(String agencia, String numeroConta, Cliente cliente, double saldo, Notificacao notificacao ,double rendimento) {
        super(agencia, numeroConta, cliente, saldo,  notificacao);
        this.notificacao = notificacao;
    }
    @Override
    public void transferir(double valor, Conta destino) {

        if (valor <= getSaldo()) {

            this.setSaldo((getSaldo() - valor) - valor * taxa);

            System.out.println("transferência realizada com sucesso");
            addExtrato(valor, "Transferência");
            notificacao.enviarNotificacao("transderência", valor);
            
        } else {
            System.out.println("Não foi possível realizar a transferência");
        }

    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + valor * rendimento);
        addExtrato(valor, "sacar");
        notificacao.enviarNotificacao("saque", valor);
    }
    @Override
    public void deposito(double valor) {
        this.setSaldo((getSaldo() + valor ) + valor * 0.1) ;
        addExtrato(valor, "deposito");
        notificacao.enviarNotificacao("deposito", valor);
    }

}
