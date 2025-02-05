package org.projetojava.four;

//Classe Abstrata -> Possui Interface(s) mas NÃO implementa
public abstract class Computador implements Eletronico {
    protected Integer numNucleo;
    private static int instObj;

    protected Computador(Integer numNucleo) {
        this.numNucleo = numNucleo;
    }

    public static void setInstObj() {
        instObj++;
    }

    public static int getInstObj() {
        return instObj;
    }
}