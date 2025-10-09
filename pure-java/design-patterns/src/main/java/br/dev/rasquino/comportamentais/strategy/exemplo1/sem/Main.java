package br.dev.rasquino.comportamentais.strategy.exemplo1.sem;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setValor(100);

        System.out.println("Frete Comum: " + pedido.calculaFreteComum());
        System.out.println("Frete Expresso: " + pedido.calculaFreExpresso());
    }
}
