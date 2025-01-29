package org.projetojava.three;

public class Son implements InterFather, InterMother {
    private String nmSon;
    private String nmFather;
    private String nmMother;

    private Son(String nmSon, String nmFather, String nmMother) {
        this.nmSon = nmSon;
        this.nmFather = nmFather;
        this.nmMother = nmMother;
    }

    public static Son factory(String nmSon, String nmFather, String nmMother) {
        return new Son(nmSon, nmFather, nmMother);
    }

    //Similar para ambas as Interfaces
    public String getNmSon() {
        return this.nmSon;
    }

    public String getNmFather() {
        return this.nmFather;
    }

    public String getNmMother() {
        return this.nmMother;
    }
}
