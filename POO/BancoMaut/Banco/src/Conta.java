public class Conta {
    private String agencia;
    private String numeroConta;
    private Cliente cliente;
    private double saldo;


    public Conta(String agencia, String numeroConta, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
       // cliente = cliente;
        this.saldo = saldo;
    }


    public Conta() {
    }


    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getcliente() {
        return cliente;
    }


    public void setcliente(String cliente) {
        cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    
}
