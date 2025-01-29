package org.projetojava.three;

public class Father implements InterFather {
    private String nmFather;

    public Father(String nmFather) {
        this.nmFather = nmFather;
    }

    public String getNmFather() {
        return this.nmFather;
    }
}
