package org.projetojava.four;

public class AviaoMisto implements Aviao {
    private double totPessoa;
    private Aeronave.Combustivel combustivel;

    public AviaoMisto(long totPessoa) {
        this.totPessoa = totPessoa;
    }

    public void setTipoCombustivel(Aeronave.Combustivel tipoCombustivel) {
        this.combustivel = tipoCombustivel;
    }
}
