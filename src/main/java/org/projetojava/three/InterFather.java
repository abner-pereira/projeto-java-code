package org.projetojava.three;

public interface InterFather {
    public String getNmFather();

    //Interface com implementação
    default public String getTexto(String nmParent) {
        return String.format("\"O nome de seu PAI é %s\"", nmParent);
    }
}
