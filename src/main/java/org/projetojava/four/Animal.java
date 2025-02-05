package org.projetojava.four;

//Classe Abstrata -> Possui Interface(s) mas NÃO implementa
public abstract class Animal implements Exibicao {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return this.nome;
    }

    //Método Abstrato
    protected abstract String getModelInfo();
}