public class BynaryTree<T extends Comparable<T>> {

    Node<T> root;


    public BynaryTree(){
        root = null;
    }

    public void insert(T value) {
        if (value == null) {
            throw new IllegalArgumentException("No se puede insertar un valor nulo.");
        }

        if (root == null) {
            root = new Node<>(value);
            return;
        }

        insertRec(value, root);
    }

    private void insertRec(T value, Node<T> node) {
        if (value.compareTo(node.val) == 0) {
            return;
        }

        if (value.compareTo(node.val) < 0) {
            if (node.left != null) {
                insertRec(value, node.left);
            } else {
                node.left = new Node<>(value);
            }
        } else {
            if (node.right != null) {
                insertRec(value, node.right);
            } else {
                node.right = new Node<>(value);
            }
        }
    }
    

    
}
