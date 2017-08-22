public class MyEntry<K, V> {

    K key;
    V value;
    MyEntry next;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public final K getKey() {
        return key;
    }
    public final V getValue() {
        return value;
    }

    void setValue(V value) {
        this.value = value;

    }


}
