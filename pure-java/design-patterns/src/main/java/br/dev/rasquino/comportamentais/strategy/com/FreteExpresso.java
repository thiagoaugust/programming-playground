package br.dev.rasquino.comportamentais.strategy.com;

public class FreteExpresso implements Frete {

    @Override
    public double calcula(double valorPedido) {
        return valorPedido * 0.1;
    }
}
