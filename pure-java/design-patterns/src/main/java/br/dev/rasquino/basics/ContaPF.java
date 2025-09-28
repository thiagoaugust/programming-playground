package br.dev.rasquino.basics;

public class ContaPF extends Conta {

    private final String cpf;

    public ContaPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
