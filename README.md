# Java Console Calculator

A simple console-based calculator application built in Java that performs basic arithmetic operations through command-line interaction.

## Features

- **Basic Arithmetic Operations**: Addition, subtraction, multiplication, and division
- **Interactive Menu**: User-friendly console interface with numbered menu options
- **Input Validation**: Robust error handling for invalid inputs
- **Division by Zero Protection**: Proper error handling for division by zero
- **Continuous Operation**: Perform multiple calculations in a single session
- **Graceful Exit**: Clean application termination

## How to Run

1. **Compile the program:**
   ```bash
   javac Calculator.java
   ```

2. **Run the calculator:**
   ```bash
   java Calculator
   ```

3. **Follow the on-screen menu:**
   - Choose operation (1-4) or exit (5)
   - Enter two numbers when prompted
   - View the result and continue with more calculations

## How to Test

1. **Compile the test file:**
   ```bash
   javac CalculatorTest.java
   ```

2. **Run the tests:**
   ```bash
   java CalculatorTest
   ```

## Example Usage

```
Welcome to Java Console Calculator!

=== Calculator Menu ===
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit
Choose an operation (1-5): 1
Enter first number: 10
Enter second number: 5

Result: 10.0 + 5.0 = 15.0
```

## Project Structure

- `Calculator.java` - Main calculator application
- `CalculatorTest.java` - Unit tests for arithmetic operations
- `README.md` - Project documentation
- `.kiro/specs/` - Project specifications and design documents

## Requirements Met

✅ Methods for addition, subtraction, multiplication, division  
✅ Scanner for user input with validation  
✅ Loop for multiple calculations until user exits  
✅ Proper Java syntax and logic flow  
✅ Error handling and edge case management  

## Technologies Used

- Java (JDK)
- Scanner class for input handling
- Exception handling for robust error management

## Author

Built as part of Java learning and console I/O practice.