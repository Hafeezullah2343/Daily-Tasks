import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * A simple arithmetic calculator using Swing.
 */
public class ArithmaticCalculator extends JFrame implements ActionListener {

    private final JTextField screen;
    private String operator;
    private double firstNumber, secondNumber, result;

    public ArithmaticCalculator() {
        // Frame settings
        setTitle("Arithmetic Calculator");
        setBounds(500, 200, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);

        // Screen setup
        screen = new JTextField();
        screen.setHorizontalAlignment(JTextField.RIGHT);
        screen.setEditable(false); // Users should not type manually
        screen.setFont(new Font("Arial", Font.BOLD, 24));
        add(screen, BorderLayout.NORTH);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setBackground(Color.BLACK);
            button.setForeground(Color.WHITE);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789".contains(command)) {
            // Append number to screen
            screen.setText(screen.getText() + command);
        } else if ("/-*+".contains(command)) {
            // Operator clicked
            firstNumber = parseScreen();
            operator = command;
            screen.setText("");
        } else if ("=".equals(command)) {
            // Equals clicked
            secondNumber = parseScreen();
            calculateResult();
            screen.setText(String.valueOf(result));
        } else if ("C".equals(command)) {
            // Clear screen
            clearCalculator();
        }
    }

    /**
     * Parses the current screen value safely.
     */
    private double parseScreen() {
        try {
            return Double.parseDouble(screen.getText());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /**
     * Performs the calculation based on the selected operator.
     */
    private void calculateResult() {
        if (operator == null) return;
        switch (operator) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> result = secondNumber != 0 ? firstNumber / secondNumber : 0;
        }
    }

    /**
     * Resets the calculator to initial state.
     */
    private void clearCalculator() {
        screen.setText("");
        operator = null;
        firstNumber = secondNumber = result = 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ArithmaticCalculator::new);
    }
}
