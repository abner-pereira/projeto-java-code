package org.projetojava.four;

public class AviaoMisto implements Aviao {
    private long totPessoa;
    private Aeronave.Combustivel combustivel;

    public AviaoMisto(long totPessoa) {
        this.totPessoa = totPessoa;
    }

    @Override
    public void setTipoCombustivel(Aeronave.Combustivel tipoCombustivel) {
        this.combustivel = tipoCombustivel;
    }

    @Override
    public String getInfo() {
        return String.format("Avião Misto: %s, Combustível: %s, Tot.Passageiro: %d",
                (this.isPassageiro() == true ? "Sim" : "Não"), this.combustivel.getDesc(), this.totPessoa);
    }
}
