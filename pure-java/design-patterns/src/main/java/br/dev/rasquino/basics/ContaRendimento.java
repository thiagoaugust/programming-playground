package br.dev.rasquino.basics;

public class ContaRendimento extends Conta{

    private String cpf;

    public ContaRendimento(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }
}
