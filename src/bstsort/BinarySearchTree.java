package bstsort;

/**
 * BinarySearchTree
 * 
 * @author matthew.towles
 * @param <T>
 * @date Feb 17, 2019
 */
public class BinarySearchTree<T extends Comparable<T>> {
    
    /**
     * Root node of this BST
     */
    private Node<T> root;
    
    
    public BinarySearchTree() {
        this.root = null;
    }
    
    public void add(T value) {
        add (value, root);
    }
    
    // recursive add method called when adding any node to BST
    private Node<T> add(T value, Node<T> node) {
        if (node == null) {
            return new Node(value);
        }
        if (value.compareTo(node.getValue()) <= 0) {
            return add(value, node.getLeft());
        }
        /*
        0. base case must be:  if node == null return new Node(value)
        1. need to find where to add our value
        2. compare value to node's value (root on first call)
        3. if value <= node.value :: add(value, node.left) << recursive
        4. else if value > node.value :: add(value, node.right)
        
        */
        return add(value, node.getRight());
    }
}
