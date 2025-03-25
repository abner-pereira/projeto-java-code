package org.projetojava.seven;

public class FutsalGen extends FutebolGen implements InterFutebolGen {
    private final int totJogador = 5;

    public FutsalGen() {
        super(modalidade.futsal);
    }

    @Override
    public int getTotJogador() {
        return totJogador;
    }
}
