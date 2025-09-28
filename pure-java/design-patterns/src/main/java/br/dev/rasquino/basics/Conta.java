package br.dev.rasquino.basics;

public abstract class Conta {

    private double saldo;

    public void sacar(double valor) {
        if(valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        }else {
            this.saldo -= valor;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
