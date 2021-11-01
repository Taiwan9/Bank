package entities;

public class Conta {
    private int conta;
    private String nome;
    private double saldo;

    public Conta() {
    }

    public Conta(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public Conta(int conta, String nome, double saldo) {
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double Saque( double saque){
        Double tax = 5.00;
        return saldo-=(saque+tax);    }
    public double Deposito(double deposito){
     return saldo+= deposito;
    }

    @Override
    public String toString() {
        return "Conta= " + conta
                +", nome= "
                + nome
                +", saldo: "
                + saldo ;
    }
}
