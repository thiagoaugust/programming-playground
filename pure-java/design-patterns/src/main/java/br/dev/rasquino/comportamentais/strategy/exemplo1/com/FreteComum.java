package br.dev.rasquino.comportamentais.strategy.com;

public class FreteComum implements Frete {

    @Override
    public double calcula(double valorPedido) {
        return valorPedido * 0.05;
    }
}
