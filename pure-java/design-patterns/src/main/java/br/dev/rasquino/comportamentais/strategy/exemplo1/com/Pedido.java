package br.dev.rasquino.comportamentais.strategy.exemplo1.com;

public abstract class Pedido {

    private double valor;
    private Frete tipoFrete;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipoFrete(Frete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public double calculaFrete(){
        return tipoFrete.calcula(this.valor);
    }
}
