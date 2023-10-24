package Classes;
import java.util.ArrayList;
import java.util.List;

public class Conta {

    private String agencia;
    private String numeroConta;
    private Cliente cliente;
    private double saldo;
    List <Transacoes> historicoTransacoes;

    // Construtor
    public Conta(String agencia, String numeroConta, Cliente cliente2, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = saldo;
        this.historicoTransacoes = new ArrayList<>();
    }

    // métodos get e set
    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getcliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            this.addExtrato(valor*-1, "saque");
            return true;
        } else {
            return false;
        }

    }

    public void deposito(double valor) {
        this.saldo += valor;
        addExtrato(valor, "deposito");
    }

    public void transferir(double valor, Conta destino) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }

    private void addExtrato(double valor, String tipo) {
        Transacoes t = new Transacoes(valor,tipo);
        this.historicoTransacoes.add(t);
    }

    public void extrato() {
        this.historicoTransacoes.forEach(t -> System.out.println(t));
        System.out.println("saldo Atual" + this.saldo);
    }
}
