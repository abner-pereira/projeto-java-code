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

    @Override
    public void setTipoCombustivel(Aeronave.Combustivel tipoCombustivel) {
        this.combustivel = tipoCombustivel;
    }

    @Override
    public String getInfo() {
        return String.format("Avião Misto: %s, Combustível: %s, Tot.Carga: %.2f Toneladas",
                (this.isPassageiro() == true ? "Sim" : "Não"), this.combustivel.getDesc(), this.totCarga);
    }
}
