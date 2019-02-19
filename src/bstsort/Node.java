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
class Node<T extends Comparable<T>> {
    
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
    
    protected T getValue() {
        return value;
    }
    
    protected void setValue(T value) {
        this.value = value;
    }
    
    protected Node<T> getLeft() {
        return left;
    }
    
    protected void setLeft(Node<T> left) {
        this.left = left;
    }
            
    protected Node<T> getRight() {
        return right;
    }
    
    protected void setRight(Node<T> right) {
        this.right = right;
    }
}
