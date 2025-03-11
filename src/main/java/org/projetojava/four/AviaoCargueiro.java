package org.projetojava.four;

public class AviaoCargueiro implements Aviao {
    private double totCarga; //Toneladas
    private Aeronave.Combustivel combustivel;

    public AviaoCargueiro(double totCarga) {
        this.totCarga = totCarga;
    }

    //Sobreposição do método Default na Interface
    @Override
    public boolean isPassageiro() {
        return false;
    }

    public void setTipoCombustivel(Aeronave.Combustivel tipoCombustivel) {
        this.combustivel = tipoCombustivel;
    }
}
