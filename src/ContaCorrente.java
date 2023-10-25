import notificacao.Notificacao;

public class ContaCorrente extends Conta {
    private double chequeEspecial;
    private double taxa = 0.1;
    private int contador;

    
    public ContaCorrente(String agencia, String numeroConta, Cliente cliente, double saldo, Notificacao notificacao,double chequeEspecial) {
        super(agencia, numeroConta, cliente, saldo, notificacao);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void transferir(double valor, Conta destino) {
    if(contador >=2){
        if (valor <= getSaldo()) {
            this.setSaldo((getSaldo() - valor) * taxa);
            System.out.println("transferência realizada com sucesso, com cobrança");
            addExtrato(valor, "transferência");
            notificacao.enviarNotificacao("Transferência", valor);
            //contador++;
        }else{
            System.out.println("Não foi possível realizar a transferência");
        }
    }else{
        this.setSaldo(getSaldo() - valor);
        System.out.println("transferência realizada com sucesso");
        contador++;
    }
    }

    public void sacar(double valor) {
        if (valor <= getSaldo() ) {
            this.setSaldo(getSaldo() - valor);
            this.addExtrato(valor*-1, "saque");
            notificacao.enviarNotificacao("saque", valor);
        }
        else if(valor > getSaldo()){
            double resto;
            resto = valor - getSaldo();
            this.setChequeEspecial(getChequeEspecial() - resto);
            System.out.println("cheque especial  " + getChequeEspecial());
        }
        else {
            
        }

    }
       

    
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    


   
}
