package bstsort;

/**
 * NumberFormatExpression
 *
 * @author matthew.towles
 * @date Feb 15, 2019
 */
public class NumberFormatExpression extends Exception {

    /**
     * Creates a new instance without detail message.
     */
    public NumberFormatExpression() {}


    /**
     * Constructs an instance with the specified detail message.
     * @param msg the detail message.
     */
    public NumberFormatExpression(String msg) {
        super(msg);
    }
}
