import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Domain Layer: Contains core business logic for calculator operations
 */
class CalculatorDomain {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}

/**
 * Application Layer: Provides services using domain logic
 */
class CalculatorService {

    private final CalculatorDomain domain;

    public CalculatorService(CalculatorDomain domain) {
        this.domain = domain;
    }

    public double performAddition(double a, double b) {
        return domain.add(a, b);
    }

    public double performSubtraction(double a, double b) {
        return domain.subtract(a, b);
    }

    public double performMultiplication(double a, double b) {
        return domain.multiply(a, b);
    }

    public double performDivision(double a, double b) {
        return domain.divide(a, b);
    }
}

/**
 * Repository Layer: Stores calculation history
 */
class CalculatorRepository {

    private final List<String> history = new ArrayList<>();

    // Save a calculation record
    public void saveCalculation(String record) {
        history.add(record);
    }

    // Return a copy of calculation history
    public List<String> getHistory() {
        return new ArrayList<>(history);
    }
}

/**
 * Controller Layer: Handles user input and coordinates service & repository
 */
class CalculatorController {

    private final CalculatorService service;
    private final CalculatorRepository repository;

    public CalculatorController(CalculatorService service, CalculatorRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter operation (+, -, *, /) or 'exit': ");
            String op = sc.nextLine();

            if (op.equalsIgnoreCase("exit")) break;

            try {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                sc.nextLine(); // Consume leftover newline

                double result;
                switch (op) {
                    case "+" -> result = service.performAddition(a, b);
                    case "-" -> result = service.performSubtraction(a, b);
                    case "*" -> result = service.performMultiplication(a, b);
                    case "/" -> result = service.performDivision(a, b);
                    default -> {
                        System.out.println("Invalid operation!");
                        continue;
                    }
                }

                String record = a + " " + op + " " + b + " = " + result;
                repository.saveCalculation(record);
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers only.");
                sc.nextLine(); // Clear invalid input
            }
        }

        // Print calculation history
        System.out.println("\nCalculation History:");
        repository.getHistory().forEach(System.out::println);

        sc.close(); // Close scanner to prevent resource leak
    }
}

/**
 * Main Class: Entry point of the application
 */
public class LayerdArcticture {

    public static void main(String[] args) {
        // Initialize layers
        CalculatorDomain domain = new CalculatorDomain();
        CalculatorService service = new CalculatorService(domain);
        CalculatorRepository repository = new CalculatorRepository();
        CalculatorController controller = new CalculatorController(service, repository);

        // Start the application
        controller.start();
    }
}
