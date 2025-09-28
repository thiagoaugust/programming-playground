package br.dev.rasquino.comportamentais.strategy.com;


public class Main {

    public static void main(String[] args) {
        var pedido = new PedidoEletronicos();
        pedido.setValor(100);
        pedido.setTipoFrete(new FreteComum());

        System.out.println("Frete Comum: " + pedido.calculaFrete());

        var pedido2 = new PedidoMoveis();
        pedido2.setValor(100);
        pedido2.setTipoFrete(new FreteExpresso());

        System.out.println("Frete Expresso: " + pedido2.calculaFrete());
    }
}
