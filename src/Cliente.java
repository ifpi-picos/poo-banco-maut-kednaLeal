
public class Cliente {

    private String nome;
    private String CPF;
    private String dataNascimento;
    private Endereco endereco;
    private Conta conta;
    
    public Cliente(String nome, String CPF, String dataNascimento, Endereco endereco, Conta conta) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.conta = conta;
    }


    public Cliente(String nome2, String cPF2, String dataNascimento2, String string, String string2) {
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCPF() {
        return CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Conta getConta(){
        return this.conta;
    }

   

    @Override
   public String toString(){
    return "Dados{ " +
            "Nome: " + nome +
            "Cpf: " + CPF +
            "Data de nascimento: " + dataNascimento +
            "}"; 
   }
    
}
