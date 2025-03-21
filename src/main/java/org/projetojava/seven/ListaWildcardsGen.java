package org.projetojava.seven;

import java.util.ArrayList;

public class ListaWildcardsGen<T1> {
    //Unbounded Wildcards
    private ArrayList<?> listaUp;

    public ListaWildcardsGen() {
        this.listaUp = new ArrayList<T1>();
    }

    public <T2> boolean addItem(T2 item) {
        //this.listaUp.add(item); --> Erro de "Capture of"
        //Helper Method para Wildcard Capture com passagem de valor por Inferência
        return this.helperAddItem(this.listaUp, item);
    }

    private <T1, T2> boolean helperAddItem(ArrayList<T1> lista, T2 item) {
        T1 itemCap = (T1) item;
        return lista.add(itemCap);
    }
}
