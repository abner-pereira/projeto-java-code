package org.projetojava.ten;

import java.lang.Exception;
import java.lang.AutoCloseable;

public class GameCube implements AutoCloseable {
    private String[] gamerCube;
    private final int MAX = 2;

    public GameCube(String... gamerCube) throws StringIndexOutOfBoundsException {
        this.gamerCube = gamerCube;

        this.validaListaGamer();
        this.validaVagaGamer();
    }

    private void validaListaGamer() throws StringIndexOutOfBoundsException {
        for (String lineGamer : this.gamerCube) {
            if (lineGamer.isEmpty() || lineGamer.isBlank()) {
                //Lançamento do erro
                throw new StringIndexOutOfBoundsException("Falha na inicialização do jogo");
            }
        }
    }

    private void validaVagaGamer() throws StringIndexOutOfBoundsException {
        if (this.gamerCube.length > this.MAX) {
            throw new StringIndexOutOfBoundsException("Limite de participantes excedido");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Exceptions => Evento: AutoCloseable sendo executado");
    }

    public String getGamerCube(int pos) {
        return this.gamerCube[pos];
    }

    public int getTotGamers() {
        return this.gamerCube.length;
    }
}
