import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta("0000-0", "444-3", 1000.0);

        System.out.println("Seja bem-vindo ao Banco Maut");
        System.out.println("Menu:\n1-Cadastrar cliente\n2-Ver saldo\n3-Depositar\n4-Sacar\n5-Transferir\n6-Ver extrato");
        System.out.println("Qual opção você deseja?");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if(opcao == 1){
            
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

        Cliente.cadastrarCliente(nome, dataNascimento, CPF, endereco, conta);
         
        }
        // else if(opcao ==2){

        //     return getSaldo();
        // }
        // else if(opcao ==3){
        //     System.out.println("Informe o valor: ");
        //     double valor = scanner.nextDouble();
        //     saldo += valor; 

        // }
        if(opcao ==4){

            // Conta conta = new Conta("0000-0", "444-3", 1000.0);
            Transacoes transacao = new Transacoes("saque", "03/10", "sacar");

            System.out.println("Informe o valor");
            double valor = scanner.nextDouble();
            if(valor <= conta.getSaldo()){

                transacao.sacar(valor, conta);

                System.out.println("saque realizado com sucesso");
                
            }else{
                System.out.println("não é possível realizar o saque verifique o saldo da Conta");
            }
        
        }
        // else if(opcao == 5){
        //     System.out.println("Informe o valor");
        //     double valor = Scanner.nextDouble();
        // }
        // else if(opcao == 6){

        // }
        // else{
        //     System.out.println("Opção inválida");
        // }
    

        

        
        

    }
}
