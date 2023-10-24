import java.util.Scanner;

import Classes.Cliente;
import Classes.Conta;

public class App {

    public static void main(String[] args) throws Exception {
        Conta conta = new Conta("0000-0", "444-3", null, 0.0);
        Cliente cliente = new Cliente("Ana", "0022", "2023-03-02", "Centro", "123");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao Banco Maut");

        while (true) {

            System.out.println("Menu:\n1-Sair\n2-Ver saldo\n3-Depositar\n4-Sacar\n5-Transferir\n6-Ver extrato");
            System.out.println("Qual opção você deseja?");
            int opcao = scanner.nextInt();

            if(opcao ==1){
                System.out.println("saindo..");
                break;
            }
            if (opcao == 2) {
                double novoSaldo = conta.getSaldo();
                System.out.println(novoSaldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor: ");
                double valor = scanner.nextDouble();
                conta.deposito(valor);
                System.out.println("déposito realizado com sucesso");

            }
            if (opcao == 4) {
                System.out.println("Informe o valor");
                double valor = scanner.nextDouble();
                if (valor <= conta.getSaldo()) {

                    conta.sacar(valor);

                    System.out.println("saque realizado com sucesso");

                } else {
                    System.out.println("não é possível realizar o saque verifique o saldo da Conta");
                }

            } else if (opcao == 5) {
                System.out.println("Informe o valor");
                double valor = scanner.nextDouble();

                System.out.println("Informe o nome do destino");
                String nomeDestinatario = scanner.nextLine();

                System.out.println("Informe o numero da conta de destino");
                String contaDestinatario = scanner.nextLine();

                if (valor <= conta.getSaldo()) {

                    conta.transferir(valor, conta);

                    System.out.println("Transeferência realizada com suesso" + valor + "para " + nomeDestinatario
                            + "numero da conta: " + contaDestinatario);
                } else {
                    System.out.println("Não foi possível realizar essa transferencia");
                }

            } else if (opcao == 6) {
                System.out.println(cliente.getNome());
                conta.extrato();
            }

        }

    }

}
