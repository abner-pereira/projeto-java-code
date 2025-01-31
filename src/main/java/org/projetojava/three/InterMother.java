package org.projetojava.three;

public interface InterMother {
    public String getNmMother();

    //Interface com implementação
    default public String getTexto(String nmParent) {
        return String.format("\"O nome de sua MÃE é %s\"", nmParent);
    }
}
