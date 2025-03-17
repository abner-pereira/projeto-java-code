package org.projetojava.seven;

import java.util.ArrayList;

/*
The most commonly used type parameter names are:
+ E - Element (used extensively by the Java Collections Framework)
+ K - Key
+ N - Number
+ T - Type
+ V - Value
+ S, U, V etc. - 2nd, 3rd, 4th types
*/

//<T> --> Tipo Genérico
public class ListaGenerica<T> {
    private ArrayList<T> lista;
    private int size;

    private ListaGenerica(int size) {
        //<T> --> Tipo Genérico
        this.lista = new ArrayList<T>();
        this.size = size;
    }

    //<T> --> Tipo Genérico
    public static <T> ListaGenerica factory(int size) {
        return new ListaGenerica<T>(size);
    }

    //T --> Tipo Genérico
    public boolean addItem(T item) {
        if (this.size == this.lista.size())
            return false;

        this.lista.add(item);
        return true;
    }

    //T --> Tipo Genérico
    public boolean removeItem(T item) {
        if (!this.lista.contains(item))
            return false;

        this.lista.remove(item);
        return true;
    }

    //T --> Tipo Genérico
    public T getItem(int index) {
        try {
            return this.lista.get(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return null;
        }
    }
}
