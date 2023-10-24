package Classes;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    public ContaCorrente(String agencia, String numeroConta, Cliente cliente, double saldo, double chequeEspecial){
        super(agencia, numeroConta, cliente, saldo);
        this.chequeEspecial = chequeEspecial;
    }
    @Override
    public void transferir(double valor,Conta destino){
        int taxa;
        if(int taxa > 2){
            this.setSaldo(getSaldo() - valor);

        }
        
    }
}
