

public class Transacoes {

    private String tipo;
    private String data;
    private String descricao; 
    
    public Transacoes(String tipo, String data, String descricao) {
        this.tipo = tipo;
        this.data = data;
        this.descricao = descricao;
    }
   
    public Transacoes(double valor, String tipo2) {
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

    
    

   
}
