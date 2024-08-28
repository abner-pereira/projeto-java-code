package org.projetojava.two;

public class Jogador {
    private String nome;
    private int pontuacao;

    //Construtor
    public Jogador() {
    }

    //Sobrecarga de Construtor
    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void addPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    //Sobrecarga de Método
    public String getPropriedade() {
        return this.nome + " + " + this.pontuacao;
    }

    public String getPropriedade(String campo) {
        String res = "";
        switch (campo.toLowerCase()) {
            case "nome":
                res = this.nome;
                break;
            case "pontuacao":
                res = Integer.toString(this.pontuacao);
                break;
        }
        return res;
    }
}
