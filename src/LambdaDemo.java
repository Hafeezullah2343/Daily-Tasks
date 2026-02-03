/**
 * Functional interface to demonstrate lambda expressions.
 */
@FunctionalInterface
interface Multiplier {
    /**
     * Performs an operation on the given integer.
     * @param value input integer
     */
    void apply(int value);

    /**
     * Default method to demonstrate default functionality in interfaces.
     */
    default void showDefaultMessage() {
        System.out.println("Executing default method...");
    }
}

/**
 * Demonstrates the usage of lambda expressions with the Multiplier interface.
 */
public class LambdaDemo {

    public static void main(String[] args) {
        // Lambda expression implementation of Multiplier
        Multiplier multiplier = (int value) -> System.out.println("Result: " + (3 * value));

        // Invoke lambda method
        multiplier.apply(5);

        // Invoke default method
        multiplier.showDefaultMessage();
    }
}
