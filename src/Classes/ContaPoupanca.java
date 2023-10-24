package Classes;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(String agencia, String numeroConta, Cliente cliente, double saldo,double rendimento ){
        super(agencia, numeroConta, cliente, saldo);
        this.rendimento = rendimento;
    }

    @Override
    public boolean sacar(double valor){
        super.sacar(valor + valor * 0.1);
        return true;
    }
}
