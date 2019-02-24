package bstsort;

/**
 * Node for a BST
 * Node uses Generic type since value could
 * be either integer or fraction type
 * 
 * @author matthew.towles
 * @param <T>
 * @date Feb 17, 2019
 */
public class Node<T extends Comparable<T>> {
    
    /**
     * Actual data held by node
     */
    private T value;
    
    /**
     * Left child
     */
    private Node<T> left;
    
    /**
     * Right child
     */
    private Node<T> right;
    
    
    /**
     * Constructor
     * @param value 
     */
    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    
    // getters & setters:
    
    public T getValue() {
        return value;
    }
    
    public Node<T> getLeft() {
        return left;
    }
    
    void setLeft(Node<T> left) {
        this.left = left;
    }
            
    public Node<T> getRight() {
        return right;
    }
    
    void setRight(Node<T> right) {
        this.right = right;
    }
}
