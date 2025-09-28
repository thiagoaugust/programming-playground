package br.dev.rasquino.basics;

public class ContaPJ extends Conta{

    private final String cnpj;

    public ContaPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
