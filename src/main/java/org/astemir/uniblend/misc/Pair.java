package org.astemir.uniblend.misc;

public class Pair<K,V> {

    public K key;
    public V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static <K,V> Pair<K,V> of(K key,V value){
        return new Pair<>(key,value);
    }
}
