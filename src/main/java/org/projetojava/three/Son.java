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

    @Override
    public String getTexto(String nmParent) {
        //Chamando métodos DEFAULT da Interface
        String msgText1 = InterFather.super.getTexto(this.nmFather);
        String msgText2 = InterMother.super.getTexto(this.nmMother);

        StringBuilder msgTexto = new StringBuilder();
        msgTexto.append(msgText1);
        msgTexto.append(" | ");
        msgTexto.append(msgText2);
        return msgTexto.toString();
    }

    public String getParent() {
        return this.getTexto("");
    }
}
