/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 7
 * Ivana Figueroa - 24785
 * 
 * Clae Node
 * Representa un nodo en el arbol binario de busqueda.
 * @param <K> Tipo de la clave
 * @param <V> Tipo del valor
 * 
 * 
 */
import java.util.Comparator;

public class Node<K,V> {
    private KeyValue<K,V> pair;
    private Node<K,V> left;
    private Node<K,V> right;


    /**
     * Crea un nuevo nodo.
     * @param k Clave
     * @param v Valor
     * @param left Hijo izquierdo
     * @param right Hijo derecho
     */
    public Node(K k, V v, Node<K,V> left, Node<K,V> right) {
        this.pair = new KeyValue<K,V>(k, v);
        this.left = null;
        this.right = null;
    }

   
    /**
     * Inserta un nuevo valor en el subarbol.
     * @param key Clave
     * @param value Valor
     * @param comp Comparador para ordenar las claves
     */
    public void insert(K key, V value, Comparator<K> comp)  {
        if (comp.compare(key, pair.getKey()) == 0) {
            pair.setValue(value); 
        } 
        else if (comp.compare(key, pair.getKey()) < 0) {
            if (left == null) {
                left = new Node<>(key, value, null, null);
            } else {
                left.insert(key, value, comp);
            }
        } 
        else {
            if (right == null) {
                right = new Node<>(key, value, null, null);
            } else {
                right.insert(key, value, comp);
            }
        }
    }


    /**
     * Recorrido inorden del subarbol.
     */
    public void inOrder() {
        if (left != null) left.inOrder();
        System.out.println(pair.getKey() + " " + pair.getValue());
        if (right != null) right.inOrder();
    }

    
    /**
     * Busca un valor por clave.
     * @param key Clave a buscar
     * @param comp Comparador
     * @return Valor asociado o null si no se encuentra
     */
    public V SearchForKey(K key, Comparator<K> comp) {
        int comparison = comp.compare(key, pair.getKey());
        if (comparison == 0) {
            return pair.getValue();
        } else if (comparison < 0) {
            return left != null ? left.SearchForKey(key, comp) : null;
        } else {
            return right != null ? right.SearchForKey(key, comp) : null;
        }
    }
   
    @Override
    public String toString(){
        return "Valor" + pair;

    }
}
