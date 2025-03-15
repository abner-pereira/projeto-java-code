package org.projetojava.seven;

import java.util.ArrayList;

//<T> --> Tipo Genérico
public class ListaGenerica<T> {
    private ArrayList<T> lista;
    private int len;

    public ListaGenerica(int len) {
        //T --> Tipo Genérico
        this.lista = new ArrayList<T>();
        this.len = len;
    }

    //T --> Tipo Genérico
    public boolean addItem(T item) {
        if (this.len == this.lista.size())
            return false;

        this.lista.add(item);
        return true;
    }

    //T --> Tipo Genérico
    public boolean removeItem(T item) {
        if (this.lista.contains(item)) {
            this.lista.remove(item);
            return true;
        } else {
            return false;
        }
    }
}
