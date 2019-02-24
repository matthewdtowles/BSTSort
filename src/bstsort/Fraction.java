package bstsort;

/**
 * Fraction - defines a fraction data type
 * Used to compare fractions to each other
 * with the goal of sorting them
 * 
 * @author matthew.towles
 * @date Feb 15, 2019
 */
public class Fraction implements Comparable<Fraction> {
    
    /**
     * numerator/denominator
     * double for comparison purposes
     */
    private double numerator;
    private double denominator;
    
    /**
     * String representation of the fraction
     */
    private String expression;

    
    /**
     * Constructor
     * Fraction expression must be well formed:
     *   e.g:  "integer/integer"
     * What a fraction cannot have:
     *   Any characters outside of 0-9 and '/'
     *   integer/0
     *   more than one '/'
     * 
     * @param expression
     * @throws bstsort.NumberFormatExpression
     */
    public Fraction(String expression) throws NumberFormatExpression {
        String[] tokens = expression.split("/");
        
        // two tokens - numerator and denominator
        if (tokens.length != 2) {
            throw new NumberFormatExpression(expression 
                    + " is not a valid fraction.");
        }
        
        // make sure numerator and denominator are numbers
        for (String t : tokens) {
            if (!t.matches("^[0-9]*$")) {
                throw new NumberFormatException(t + " is not a number.");
            }
        }
        
        this.expression = expression;
        numerator = Double.parseDouble(tokens[0]);
        denominator = Double.parseDouble(tokens[1]);
        
        if (denominator == 0) {
            throw new ArithmeticException(expression 
                    + " invalid. Cannot divide by 0.");
        }
    }
    
    
    /**
     * Returns 1, 0, or -1
     * 1:  this is larger than given fraction
     * 0:  this is equal to given fraction
     * -1: this is less than given fraction
     * 
     * @param in - fraction to compare this to
     * @return int 1/0/-1
     */
    @Override
    public int compareTo(Fraction in) {
        double thisQuotient = numerator/denominator;
        double inQuotient = in.getNumerator()/in.getDenominator();
        if (thisQuotient > inQuotient) {
            return 1;
        } else if (thisQuotient < inQuotient) {
            return -1;
        }
        return 0;
    }
    
    
    /**
     * @return fraction in string form
     */
    @Override
    public String toString() {
        return expression;
    }
    
    /**
     * @return numerator
     */
    public double getNumerator() {
        return numerator;
    }
    
    /**
     * @return denominator
     */
    public double getDenominator() {
        return denominator;
    }
    
}
