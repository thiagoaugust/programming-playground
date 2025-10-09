package br.dev.rasquino.comportamentais.strategy.exemplo1.com;

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

    @Override
    public void setTipoFrete(Frete tipoFrete) {
        if(tipoFrete instanceof FreteExpresso) {
            throw new IllegalArgumentException("Frete expresso não disponível para móveis.");
        }
        super.setTipoFrete(tipoFrete);
    }
}
