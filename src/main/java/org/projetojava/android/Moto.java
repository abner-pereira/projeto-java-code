package org.projetojava.android;

public class Moto extends Veiculo implements Eletrificado {
    public Moto(String nome, int qtdRodas) {
        super(nome, qtdRodas);
    }

    public void motorEletrico() {
        System.out.println("Android => Característica: Motor Elétrico");
    }

    public void acelerar() {
        super.acelerar();
        motorEletrico();
    }

    public void acelerar(int intensidade) {
        super.acelerar(intensidade);
        motorEletrico();
    }
}