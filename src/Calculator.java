import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A simple Swing-based calculator supporting basic arithmetic operations.
 */
public class Calculator extends JFrame implements ActionListener {

    private final JTextField display;
    private String operator;
    private double firstNumber, secondNumber, result;

    public Calculator() {
        initializeFrame();
        display = createDisplay();
        add(display, BorderLayout.NORTH);
        add(createButtonPanel(), BorderLayout.CENTER);
        setVisible(true);
    }

    /**
     * Initializes the main frame properties.
     */
    private void initializeFrame() {
        setTitle("Calculator");
        setBounds(150, 150, 300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    /**
     * Creates and configures the display field.
     */
    private JTextField createDisplay() {
        JTextField field = new JTextField();
        field.setFont(new Font("Arial", Font.BOLD, 24));
        field.setHorizontalAlignment(JTextField.RIGHT);
        field.setEditable(false);
        return field;
    }

    /**
     * Creates the calculator button panel.
     */
    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (isDigit(command)) {
            display.setText(display.getText() + command);
        } else if (isOperator(command)) {
            firstNumber = parseDisplay();
            operator = command;
            display.setText("");
        } else if ("=".equals(command)) {
            secondNumber = parseDisplay();
            calculate();
            display.setText(String.valueOf(result));
        } else if ("C".equals(command)) {
            clearCalculator();
        }
    }

    /**
     * Checks if the command is a digit.
     */
    private boolean isDigit(String command) {
        return "0123456789".contains(command);
    }

    /**
     * Checks if the command is an operator.
     */
    private boolean isOperator(String command) {
        return "+-*/".contains(command);
    }

    /**
     * Parses the display value safely.
     */
    private double parseDisplay() {
        try {
            return Double.parseDouble(display.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /**
     * Performs the calculation based on the selected operator.
     */
    private void calculate() {
        if (operator == null) return;

        switch (operator) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = secondNumber != 0
                    ? firstNumber / secondNumber
                    : Double.NaN;
        }
    }

    /**
     * Resets the calculator state.
     */
    private void clearCalculator() {
        display.setText("");
        firstNumber = secondNumber = result = 0;
        operator = null;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }
}
