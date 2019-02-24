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
    
    
    /**
     * Sorted values of BST nodes
     */
    private String sortedValues;
    
    
    /**
     * Constructor
     * Simply sets root to null
     */
    public BinarySearchTree() {
        root = null;
        sortedValues = "";
    }
    
    
    /**
     * Adds a node to the BST
     * Calls the recursive add if root is not null
     * If root is null then a new node is made
     * and assigned as root of BST
     * 
     * @param value - used to create new node for BST
     */
    public void add(T value) {
        if (root == null) {
            root = new Node(value);
        } else {
            add (value, root);
        }
    }
    
    
    /**
     * Recursively adds a new node to BST
     * 
     * 3 possible outcomes:
     * 1. Node passed is null
     *   This is the base case
     *   This means that passed node has a vacant
     *   spot, so we create a new node and return
     *   it which bubbles up to previous add() call
     *   which will set that passed node's right/left
     *   child to the return value
     * 2. Value is less or equal to Node's value
     *   The eventual node will be on the left subtree
     *   relative to the node it was compared to
     *   This is a recursive step
     * 3. Value is greater than Node's value
     *   The eventual node will be on the right subtree
     *   relative to the node it was compared to
     *   This is a recursive step
     * 
     * @param value - future new node
     * @param node - node to compare value to
     * @return new node made from value passed
     */
    private Node<T> add(T value, Node<T> node) {
        // base case - create new node with value
        if (node == null) {
            node = new Node(value);
        } else if (value.compareTo(node.getValue()) <= 0) {
            // go to left subtree
            node.setLeft(add(value, node.getLeft()));
        } else {
            // go to right subtree
            node.setRight(add(value, node.getRight()));
        }
        return node;
    }
    
    
    /**
     * Sort nodes in asc or desc order
     * @param reverse - true to sort in desc
     */
    public void sort(boolean reverse) {
        if (reverse) {
            postorderTraversal(getRoot());
        } else {
            inorderTraversal(getRoot());
        }
    }
    
    
    /**
     * Sort nodes in asc order
     * @param node 
     */
    private void inorderTraversal(Node<T> node) {
        // base case
        if (node == null) {
            return;
        }
        
        inorderTraversal(node.getLeft());
        sortedValues += node.getValue() + " ";
        inorderTraversal(node.getRight());
    }
    
    
    /**
     * Sort nodes in desc order
     * @param node 
     */
    private void postorderTraversal(Node<T> node) {
        // base case
        if (node == null) {
            return;
        }
        
        postorderTraversal(node.getRight());
        sortedValues += node.getValue() + " ";
        postorderTraversal(node.getLeft());
    }
    
    
    /**
     * @return root
     */
    public Node<T> getRoot() {
        return root;
    }
    
    /**
     * @return sortedValues
     */
    public String getSortedValues() {
        return sortedValues;
    }
}
