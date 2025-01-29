package org.projetojava.three;

public class Mother implements InterMother {
    private String nmMother;

    public Mother(String nmMother) {
        this.nmMother = nmMother;
    }

    public String getNmMother() {
        return this.nmMother;
    }
}
