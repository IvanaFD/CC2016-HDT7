/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 7
 * Ivana Figueroa - 24785
 * 
 * Clase BST
 * Implementacion de arbol binario de busqueda .
 * @param <K> Tipo de la clave
 * @param <V> Tipo del valor
 *
 */
import java.util.Comparator;

public class BST<K,V> {
    private Node<K,V> root;
    private Comparator<K> comparator;


    /**
     * Crea un nuevo BST.
     * @param comp Comparador para ordenar las claves
     * @param root Raiz del arbol
     */
    public BST(Comparator<K> comp){
        root = null;
        comparator = comp;
    }
    

    /**
     * Inserta un nuevo elemento.
     * @param key Clave
     * @param value Valor
     */
    public void insert (K k, V v) {
        if (root == null) root = new Node<K, V> (k, v, null, null);
        else root.insert(k, v, comparator);
    }


    /**
     * Busca un valor por clave.
     * @param key Clave a buscar
     * @return Valor asociado o null si no se encuentra
     */
    public void inOrder () {
        if (root == null) System.out.println("Empty tree!");
        else root.inOrder();
    }
    

    /**
     * Muestra todos los elementos en orden.
     */
    public V Search(K key) {
        if (key == null || root == null) {
            return null;
        }
        return root.SearchForKey(key, comparator);
    }
       

}
