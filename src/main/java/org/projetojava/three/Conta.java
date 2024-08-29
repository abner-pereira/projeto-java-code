package org.projetojava.three;

//Classe com package-private
class Conta {
    protected int agencia;
    protected int conta;
    protected double saldo;

    Conta(int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
    }

    public void addSaldo(double saldo) {
        this.saldo += saldo;
    }
}