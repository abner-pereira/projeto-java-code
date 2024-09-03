package org.projetojava.android;

public abstract class Veiculo {
    protected String nome;
    protected int qtdRodas;

    protected Veiculo(String nome, int qtdRodas) {
        this.nome = nome;
        this.qtdRodas = qtdRodas;
    }

    public void acelerar() {
        System.out.println("Android => Acelerar: " + this.nome + ", Rodas: " + this.qtdRodas);
    }

    public void acelerar(int intensidade) {
        System.out.println(
                "Android => Acelerar: " + this.nome + ", Rodas: " + this.qtdRodas +
                        ", Intensidade: " + intensidade);
    }
}