package br.dev.rasquino.comportamentais.strategy.sem;

public class Pedido {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calculaFreteComum() {
        return this.valor * 0.05;
    }

    public double calculaFreExpresso() {
        return this.valor * 0.1;
    }
}
