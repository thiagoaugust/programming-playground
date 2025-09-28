package br.dev.rasquino.basics;

import java.util.List;

public class Banco {

    private List<Conta> contas;
    private List<Cliente> clientes;

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Conta> getContasPF() {
        return this.contas.stream()
                .filter(conta -> conta instanceof ContaPF)
                .toList();
    }
    public List<Conta> getContasPJ() {
        return this.contas.stream()
                .filter(conta -> conta instanceof ContaPJ)
                .toList();
    }
}
