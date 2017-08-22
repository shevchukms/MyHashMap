import java.util.Arrays;

public class MyHashMap<K, V> {

    private static final int SIZE = 16;
    private MyEntry table[] = new MyEntry[SIZE];


    private int getSupplementalHash(int h) {


        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    private int getBucketNumber(int hash) {
        return hash & (SIZE - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyHashMap<?, ?> myHashMap = (MyHashMap<?, ?>) o;

        return Arrays.equals(table, myHashMap.table);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(table);
    }

    public void put(K key, V value) {
        int userHash = key.hashCode();
        int hash = getSupplementalHash(userHash);


        int bucket = getBucketNumber(hash);
        MyEntry existingElement = table[bucket];

        for (; existingElement != null; existingElement = existingElement.next) {

            if (existingElement.key.equals(key)) {
                System.out
                        .println("duplicate key value pair, replacing existing key "
                                + key + ", with value " + value);
                existingElement.value = value;
                return;
            } else {
                System.out.println("Collision detected for key " + key
                        + ", adding element to the existing bucket");

            }
        }

        System.out.println("PUT adding key:" + key + ", value:" + value
                + " to the list");
        MyEntry entryInOldBucket = new MyEntry(key, value);
        entryInOldBucket.next = table[bucket];
        table[bucket] = entryInOldBucket;
    }


    public MyEntry get(K key) {

        int hash = getSupplementalHash(key.hashCode());

        int bucket = getBucketNumber(hash);

        MyEntry existingElement = table[bucket];


        while (existingElement != null) {
            System.out.println("Traversing the list inside the bucket for the key "
                    + existingElement.getKey());
            if (existingElement.key.equals(key)) {
                return existingElement;
            }
            existingElement = existingElement.next;
        }

        return null;
    }


    public int size() {
        return size();
    }
}
