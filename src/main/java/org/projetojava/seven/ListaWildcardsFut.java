package org.projetojava.seven;

import java.util.ArrayList;

public class ListaWildcardsFut {
    //Wildcards
    private ArrayList<?> lista;
    private ArrayList<? extends FutebolGen> listaUp;
    private ArrayList<? super FutebolGen> listaLow;

    public static enum tipoBounded {
        UN, UPPER, LOWER;
    }

    public ListaWildcardsFut(tipoBounded bounded) {
        switch (bounded) {
            case tipoBounded.UPPER -> this.listaUp = new ArrayList<>();
            case tipoBounded.LOWER -> this.listaLow = new ArrayList<>();
            default -> this.lista = new ArrayList<>();
        }
    }

    public <T1> boolean addItem(T1 item) {
        //this.listaUp.add(item); --> Erro de "Capture of"
        //Helper Method para Wildcard Capture com passagem de valor por Inferência
        if (this.listaUp != null) {
            return this.helperAddItem(this.listaUp, item);

        } else if (this.listaLow != null) {
            return this.helperAddItem(this.listaLow, item);

        } else {
            return this.helperAddItem(this.lista, item);
        }
    }

    private <T1, T2> boolean helperAddItem(ArrayList<T1> lista, T2 item) {
        T1 itemCap = (T1) item;
        return lista.add(itemCap);
    }

    //Unbounded Wildcards
    public ArrayList<?> getList() {
        if (this.listaUp != null) {
            return this.listaUp;

        } else if (this.listaLow != null) {
            return this.listaLow;

        } else {
            return this.lista;
        }
    }
}
