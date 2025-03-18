package org.projetojava.seven;

/*
A type variable can be any non-primitive type you specify:
+ any class type,
+ any interface type,
+ any array type,
+ or even another type variable.

The most commonly used type parameter names are:
+ E - Element (used extensively by the Java Collections Framework)
+ K - Key
+ N - Number
+ T - Type
+ V - Value
+ S, U, V etc. - 2nd, 3rd, 4th types
*/

/**
 * @param <K> Tipo Genérico (Somente Classes herdada da classe Number)
 * @param <V> Tipo Genérico
 */
public class ItemGenerico<K extends Number, V> {
    private K key;
    private V value;

    public ItemGenerico(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }
}
