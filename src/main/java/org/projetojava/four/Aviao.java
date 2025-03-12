package org.projetojava.four;

public interface Aviao extends Aeronave {
    public String getInfo();

    default public boolean isPassageiro() {
        return true;
    }
}