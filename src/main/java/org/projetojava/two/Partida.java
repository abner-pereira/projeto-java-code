package org.projetojava.two;

import java.util.Random;

/*
*** Visibilidade:
** At the top level:
+ public
+ package-private (no explicit modifier)

** At the member level:
+ public
+ protected
+ package-private (no explicit modifier)
+ private

+1 -> Podem ser usados em Classes, Interfaces, Métodos e Atributos
+2 -> package-private -> Visibilidade somente dentro do Pacote
*/

public class Partida {
    int idPartida;
    Jogador jogadorOne;
    Jogador jogadorTwo;

    //Construtor
    public Partida() {
        this.idPartida = new Random().nextInt();
    }

    public Partida(Jogador jogOne, Jogador jogTwo) {
        this.idPartida = new Random().nextInt();
        this.jogadorOne = jogOne;
        this.jogadorTwo = jogTwo;
    }

    String showDados() {
        return "ID: " + this.idPartida +
                "; Player 1: " + this.jogadorOne.getPontuacao() +
                "; Player 2: " + this.jogadorTwo.getPontuacao();
    }
}
