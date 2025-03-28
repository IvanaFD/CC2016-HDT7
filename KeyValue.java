/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 7
 * Ivana Figueroa - 24785
 * 
 *Clase KeyValue
 * Almacena un par clave-valor generico.
 * @param <K> Tipo de la clave
 * @param <V> Tipo del valor
 */
public class KeyValue<K ,V> {
    private K key;
    private V value;


    /**
     * Crea una nueva asociacion clave-valor.
     * @param k Clave
     * @param v Valor
     */
    
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
