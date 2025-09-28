package br.dev.rasquino.basics;

public class Cliente {

    public Cliente(Conta conta){
        if(conta instanceof ContaPF){
            System.out.println("Conta PF criada com sucesso!");
            System.out.println("CPF: " + ((ContaPF) conta).getCpf());
        } else if (conta instanceof ContaPJ) {
            System.out.println("Conta PJ criada com sucesso!");
            System.out.println("CNPJ: " + ((ContaPJ) conta).getCnpj());
        }
    }
}
