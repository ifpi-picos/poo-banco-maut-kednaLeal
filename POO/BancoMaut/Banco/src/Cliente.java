import java.util.Scanner;

public class Cliente {

    private String nome;
    private String CPF;
    private String dataNascimento;
    private Endereco endereco;
    
    public Cliente(String nome, String CPF, String dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
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

    public static Cliente cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do cliente:");
        String CPF = scanner.nextLine();

        System.out.println("Digite o data de nascimento do cliente:");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite a rua do endereço:");
        String rua = scanner.nextLine();

        System.out.println("Digite o bairro do endereço:");
        String bairro = scanner.nextLine();

        System.out.println("Digite o cep do endereço:");
        String cep = scanner.nextLine();

        System.out.println("Digite a cidade do endereço:");
        String cidade = scanner.nextLine();

        System.out.println("Digite o estado do endereço:");
        String estado = scanner.nextLine();

        Endereco endereco = new Endereco(rua, bairro, cidade, estado, cep);
        return new Cliente(nome, dataNascimento, CPF, endereco);
        
    }


   public String toString(){
    return "Dados{ " +
            "Nome: " + nome +
            "Cpf: " + CPF +
            "Data de nascimento: " + dataNascimento +
            "}"; 
   }
    
}
