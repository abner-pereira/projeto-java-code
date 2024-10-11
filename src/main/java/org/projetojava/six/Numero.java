package org.projetojava.six;

public class Numero {
    private int[] intSorteio;

    public Numero(int... listInt) {
        int pos = 0;
        intSorteio = new int[listInt.length];
        for (int oneInt : listInt) {
            intSorteio[pos] = oneInt;
            pos++;
        }
    }

    public void sortDados() {
        int atual = 0;
        int idxNext = 0;
        int interArray = 0;

        do {
            for (int idx = 0; idx < intSorteio.length; idx++) {
                idxNext = idx;
                idxNext++;

                if (idxNext >= intSorteio.length) {
                    break;
                }

                if (intSorteio[idx] > intSorteio[idxNext]) {
                    interArray = intSorteio[idx];
                    intSorteio[idx] = intSorteio[idxNext];
                    intSorteio[idxNext] = interArray;
                }
            }
            atual++;
        } while (atual < intSorteio.length);
    }

    public void showDados() {
        String num = "";
        int pos = 0;
        do {
            num = num.concat(Integer.toString(intSorteio[pos])).concat(" | ");
            pos++;
        } while (pos < intSorteio.length);

        System.out.println("Sorteio => Nr. Informados: " + num);
    }
}
