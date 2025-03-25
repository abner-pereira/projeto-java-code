package org.projetojava.seven;

import java.util.Random;

public class FutebolGen {
    private String idTime;
    private static Random random = new Random();

    protected enum modalidade {
        futsal, nula;
    }

    //Construtor com Visibilidade Ilimitada
    public FutebolGen() {
        this.idTime = geraIdTime(modalidade.nula);
    }

    //Construtor com Visibilidade Limitada (Protegido)
    protected FutebolGen(modalidade modal) {
        this.idTime = geraIdTime(modal);
    }

    public String getIdTime() {
        return this.idTime;
    }

    private String geraIdTime(modalidade modal) {
        return switch (modal) {
            case modalidade.futsal -> "FTS-" + String.format("%04d", random.nextInt(1000));
            default -> "GEN-" + String.format("%04d", random.nextInt(1000));
        };
    }
}
