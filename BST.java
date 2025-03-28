import java.util.Comparator;

public class BST<K,V> {
    private Node<K,V> root;
    private Comparator<K> comparator;

    public BST(Comparator<K> comp){
        root = null;
        comparator = comp;
    }
    
    public void insert (K k, V v) {
        if (root == null) root = new Node<K, V> (k, v, null, null);
        else root.insert(k, v, comparator);
    }

    public void inOrder () {
        if (root == null) System.out.println("Empty tree!");
        else root.inOrder();
    }
    
    public V SearchforKey (K key) {
        if (root == null) return null;
        return root.SearchForKey(key, comparator);
    }
       

}
