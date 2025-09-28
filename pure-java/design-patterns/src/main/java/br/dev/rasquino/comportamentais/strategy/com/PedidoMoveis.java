package br.dev.rasquino.comportamentais.strategy.com;

public class PedidoMoveis extends Pedido {

    private String nomeSetor;

    public PedidoMoveis() {
        this.nomeSetor = "Móveis";
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
}
