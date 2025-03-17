package org.projetojava.seven;

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
