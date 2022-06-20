package entities;

public class Bank {

    private double saldo = 0.0;
    private String name;
    private int conta;

    public Bank(String name, int conta) {
        this.name = name;
        this.conta = conta;
    }

    public Bank(double depositoInicial, String name, int conta) {
        this.name = name;
        this.conta = conta;
        deposito(depositoInicial);
    }

    public double getSaldo() {
        return saldo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getConta() {
        return (int)conta;
    }
    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saque (double quantia) {
        saldo -= quantia + 5.0;
    }
    public String toString() {
        return "Titular Sr(a):"
                + name
                + ", conta: "
                + conta
                + ", saldo: $"
                + String.format("%.2f", saldo);
    }

}

