package org.projetojava.four;

public interface Aviao extends Aeronave {
    default public boolean isPassageiro() {
        return true;
    }
}