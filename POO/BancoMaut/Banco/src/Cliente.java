import java.util.Scanner;

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

    public static Cliente cadastrarCliente(String nome, String dataNascimento, String CPF, Endereco endereco, Conta conta) {
        
        return new Cliente(nome, dataNascimento, CPF, endereco, conta);
        
    }


   public String toString(){
    return "Dados{ " +
            "Nome: " + nome +
            "Cpf: " + CPF +
            "Data de nascimento: " + dataNascimento +
            "}"; 
   }
    
}
