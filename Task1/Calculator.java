import java.util.Scanner;

/**
 * Java Console Calculator
 * A simple calculator that performs basic arithmetic operations through console interaction.
 */
public class Calculator {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        try {
            System.out.println("Welcome to Java Console Calculator!");
            runCalculator();
            System.out.println("Thank you for using the calculator. Goodbye!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            System.out.println("Please restart the calculator.");
        } finally {
            scanner.close();
        }
    }
    
    // Main application loop
    private static void runCalculator() {
        boolean continueCalculating = true;
        
        while (continueCalculating) {
            try {
                displayMenu();
                int choice = getUserChoice();
                
                if (choice == 5) {
                    continueCalculating = false;
                } else {
                    performOperation(choice);
                }
            } catch (Exception e) {
                System.out.println("An error occurred during calculation: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }
    
    // Arithmetic methods
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN; // Return NaN to indicate error
        }
        return a / b;
    }
    
    // User interface methods
    private static void displayMenu() {
        System.out.println("\n=== Calculator Menu ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.print("Choose an operation (1-5): ");
    }
    
    private static int getUserChoice() {
        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer
                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.out.print("Invalid choice! Please enter a number between 1-5: ");
                }
            } else {
                System.out.print("Invalid input! Please enter a number between 1-5: ");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
    
    private static double getNumberInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                scanner.nextLine(); // Clear the buffer
                return number;
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
    
    private static void displayResult(double num1, double num2, char operation, double result) {
        System.out.println("\nResult: " + num1 + " " + operation + " " + num2 + " = " + result);
    }
    
    private static void performOperation(int choice) {
        if (choice == 5) {
            return; // Exit option, handled in main loop
        }
        
        double num1 = getNumberInput("Enter first number: ");
        double num2 = getNumberInput("Enter second number: ");
        double result = 0;
        char operation = ' ';
        
        switch (choice) {
            case 1:
                result = add(num1, num2);
                operation = '+';
                break;
            case 2:
                result = subtract(num1, num2);
                operation = '-';
                break;
            case 3:
                result = multiply(num1, num2);
                operation = '*';
                break;
            case 4:
                result = divide(num1, num2);
                operation = '/';
                if (Double.isNaN(result)) {
                    return; // Division by zero error already handled
                }
                break;
        }
        
        displayResult(num1, num2, operation, result);
    }
}