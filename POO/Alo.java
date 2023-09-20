//import java.util.scanner;

//  System.out.println("Digite sua idade: ");
// int num = scanner.nextInt();

public class Alo{

    public static void main(String args[]){
        //para imprimr no terminal 
        System.out.println("Alô turma!\n...");
        System.out.println("Qual é o seu nome? ");

        //para leitura do teclado

        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();
        System.out.println("Seja be, vindo(A), " + nome);
    }
}