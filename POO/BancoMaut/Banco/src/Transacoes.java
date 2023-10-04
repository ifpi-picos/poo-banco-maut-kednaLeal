import java.util.Scanner;

public class Transacoes {

    private String tipo;
    private String data;
    private String descricao;
    Scanner scanner = new Scanner(System.in); 
    
    public Transacoes(String tipo, String data, String descricao) {
        this.tipo = tipo;
        this.data = data;
        this.descricao = descricao;
    }
   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void sacar(double valor, Conta conta){
        double novoSaldo = conta.getSaldo() - valor;
        conta.setSaldo(novoSaldo);
        System.out.println(novoSaldo);
    }

    public void deposito(double valor){

    }
    public void transferir(Cliente destino, double valor){  
       
    }

    public void addExtrato(String imformacao){

    }

    public void extrato(String dados){

    }
}
