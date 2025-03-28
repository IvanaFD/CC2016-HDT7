public class KeyValue<K ,V> {
    private K key;
    private V value;

    public KeyValue(K k, V v) {
        key = k;
        value = v;
    }

    public K getKey(){return key;}
    public V getValue(){return value;}
    public void setValue(V v){value = v;}

    public String toString(){
        return " ( " + key + " = " + value + " ) ";
    }
    
}
