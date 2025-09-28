package br.dev.rasquino.comportamentais.strategy.com;

public class PedidoEletronicos extends Pedido {

    private String nomeSetor;

    public PedidoEletronicos() {
        this.nomeSetor = "Eletrônicos";
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
}
