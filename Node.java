public class Node<T extends Comparable<T>> {
    T val;
    Node<T> left;
    Node<T> right;

    public Node(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString(){
        return "Valor" + val;

    }
        

   

   
    
}
