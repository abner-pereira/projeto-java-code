package org.projetojava.four;

//Classe Abstrata
public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return this.nome;
    }
}