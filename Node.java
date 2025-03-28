import java.util.Comparator;

public class Node<K,V> {
    private KeyValue<K,V> pair;
    private Node<K,V> left;
    private Node<K,V> right;

    public Node(K k, V v, Node<K,V> left, Node<K,V> right) {
        this.pair = new KeyValue<K,V>(k, v);
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString(){
        return "Valor" + pair;

    }
    
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

    public void inOrder() {
        if (left != null) left.inOrder();
        System.out.println(pair.getKey() + " " + pair.getValue());
        if (right != null) right.inOrder();
    }

    public V SearchForKey(K key, Comparator<K> comp) {
        if (comp.compare(key, pair.getKey()) == 0) {
            return pair.getValue();
        } 
        else if (comp.compare(key, pair.getKey()) < 0) {
            return left != null ? left.SearchForKey(key, comp) : null;
        } 
        else {
            return right != null ? right.SearchForKey(key, comp) : null;
        }
    }
   
    
}
