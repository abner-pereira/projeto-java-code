package org.projetojava.eight;

public class VeiculoLambda {
    private String placa;

    public VeiculoLambda(String placa) {
        this.placa = placa;
    }

    public static VeiculoLambda factory(String placa) {
        return new VeiculoLambda(placa);
    }

    public String getPlaca() {
        return this.placa;
    }
}
