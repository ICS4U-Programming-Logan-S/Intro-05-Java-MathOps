/**
* Writes math equations.
*
* @author  Logan S
* @version 1.0
* @since   2023-02-15
*/
public final class MathOps {

    /**
     * This is a private constructor.
     *
     */
    private MathOps() { }

    /**
     * This is the main method.
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        
        // Addition
        System.out.println("34 + 867 = " + (34 + 867));
        // Subtraction
        System.out.println("24875 - 8732 = " + (24875 - 8732));
        // Multiplication
        System.out.println("6325 * 353 = " + (6325 * 353));
        // Division
        System.out.println("564124 ÷ 1567 = " + (564124 / 1567));
        // Division with float numbers
        System.out.println("564124 ÷ 1567 = " + (564124f / 1567f));
        // Division with double numbers
        System.out.println("564124 ÷ 1567 = " + (564124d / 1567d));
        // Exponent to the power of 2
        System.out.println("15² = " + (Math.pow(15, 2)));
        // Exponent to the power of 3
        System.out.println("15³ = " + (Math.pow(15, 3)));

        System.out.println("√625 = " + (Math.sqrt(625)));
    }
}
