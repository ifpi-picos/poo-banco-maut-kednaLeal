import notificacao.Email;
import notificacao.Notificacao;
import notificacao.Sms;

public class App {

    public static void main(String[] args) throws Exception {
        Notificacao notificacao = new Email();
        Notificacao notificacaoSMS = new Sms(); 
        Conta conta = new Conta("0000-0", "444-3", null, 0.0, notificacaoSMS);
        Endereco end = new Endereco("quadra", "pantanal", "999-0","Picos", "Piauí");
        Cliente cliente = new Cliente("Ana", "0022", "2023-03-02", end, conta);
       
        
        //Scanner scanner = new Scanner(System.in);
        Conta contaCo = new ContaCorrente("333-0", "2332-0", cliente, 0.0, notificacao,1000);
        Conta contaPo = new ContaPoupanca("4444-0", "4501-5", cliente, 0.0, notificacaoSMS, 0.0);
        System.out.println("Seja bem-vindo ao Banco Maut");
        System.out.println(cliente.getNome());

        // conta.deposito(1000.0);
        // conta.transferir(100, contaPo);
        // conta.sacar(500);

        // contaCo.deposito(150);
        // contaCo.transferir(10, contaPo);
        // contaCo.transferir(10, contaPo);
        // contaCo.transferir(10, contaPo);
        // contaCo.transferir(10, contaPo);
        // contaCo.transferir(10, contaPo);
        // contaCo.sacar(305);

        contaPo.deposito(1000);
        // contaPo.transferir(10, contaPo);
        // contaPo.sacar(300);

        //System.out.println("saldo conta " + conta.getSaldo());
       // System.out.println("saldo contaCorrente " + contaCo.getSaldo());
        System.out.println("saldo contaPoupança " + contaPo.getSaldo());

        

    }

}
