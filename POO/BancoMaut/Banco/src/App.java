import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente(null, null, null, null);
        c1.cadastrarCliente();

        System.out.println("Seja bem-vindo(a) ao Banco Maut");
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para se cadastrar digite 1\n para 2");
        String entrada = scanner.nextLine();

    }
}
