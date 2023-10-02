public class Conta {
    private String agencia;
    private String numeroConta;
    private String ClienteVinculado;


    public Conta(String agencia, String numeroConta, String clienteVinculado) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        ClienteVinculado = clienteVinculado;
    }


    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getClienteVinculado() {
        return ClienteVinculado;
    }


    public void setClienteVinculado(String clienteVinculado) {
        ClienteVinculado = clienteVinculado;
    }

    

    
}
