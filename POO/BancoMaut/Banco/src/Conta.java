public class Conta {
    private String agencia;
    private String numeroConta;
    private Cliente cliente;


    public Conta(String agencia, String numeroConta, Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        cliente = cliente;
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

    

    
}
