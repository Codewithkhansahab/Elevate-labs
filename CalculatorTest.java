/**
 * Simple test class for Calculator functionality
 * Run this to verify all arithmetic operations work correctly
 */
public class CalculatorTest {
    
    public static void main(String[] args) {
        System.out.println("Running Calculator Tests...\n");
        
        // Test addition
        testAddition();
        
        // Test subtraction
        testSubtraction();
        
        // Test multiplication
        testMultiplication();
        
        // Test division
        testDivision();
        
        // Test division by zero
        testDivisionByZero();
        
        System.out.println("All tests completed!");
    }
    
    private static void testAddition() {
        System.out.println("Testing Addition:");
        double result1 = Calculator.add(10, 5);
        double result2 = Calculator.add(-3, 7);
        double result3 = Calculator.add(0, 0);
        
        System.out.println("10 + 5 = " + result1 + " (Expected: 15.0)");
        System.out.println("-3 + 7 = " + result2 + " (Expected: 4.0)");
        System.out.println("0 + 0 = " + result3 + " (Expected: 0.0)");
        System.out.println();
    }
    
    private static void testSubtraction() {
        System.out.println("Testing Subtraction:");
        double result1 = Calculator.subtract(10, 5);
        double result2 = Calculator.subtract(-3, 7);
        double result3 = Calculator.subtract(5, 5);
        
        System.out.println("10 - 5 = " + result1 + " (Expected: 5.0)");
        System.out.println("-3 - 7 = " + result2 + " (Expected: -10.0)");
        System.out.println("5 - 5 = " + result3 + " (Expected: 0.0)");
        System.out.println();
    }
    
    private static void testMultiplication() {
        System.out.println("Testing Multiplication:");
        double result1 = Calculator.multiply(4, 7);
        double result2 = Calculator.multiply(-5, 3);
        double result3 = Calculator.multiply(0, 100);
        
        System.out.println("4 * 7 = " + result1 + " (Expected: 28.0)");
        System.out.println("-5 * 3 = " + result2 + " (Expected: -15.0)");
        System.out.println("0 * 100 = " + result3 + " (Expected: 0.0)");
        System.out.println();
    }
    
    private static void testDivision() {
        System.out.println("Testing Division:");
        double result1 = Calculator.divide(20, 4);
        double result2 = Calculator.divide(15, 3);
        double result3 = Calculator.divide(7, 2);
        
        System.out.println("20 / 4 = " + result1 + " (Expected: 5.0)");
        System.out.println("15 / 3 = " + result2 + " (Expected: 5.0)");
        System.out.println("7 / 2 = " + result3 + " (Expected: 3.5)");
        System.out.println();
    }
    
    private static void testDivisionByZero() {
        System.out.println("Testing Division by Zero:");
        System.out.println("Attempting 10 / 0:");
        double result = Calculator.divide(10, 0);
        System.out.println("Result: " + result + " (Expected: NaN with error message)");
        System.out.println();
    }
}