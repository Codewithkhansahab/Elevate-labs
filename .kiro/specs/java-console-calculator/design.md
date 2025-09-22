# Design Document

## Overview

The Java Console Calculator will be implemented as a single-class application that uses object-oriented principles to organize calculation methods and user interaction logic. The design emphasizes simplicity, maintainability, and robust error handling while providing a clean console-based user experience.

## Architecture

The application follows a simple procedural architecture with method-based organization:

```
Calculator Application
├── Main Method (Entry Point)
├── User Interface Layer
│   ├── displayMenu()
│   ├── getUserChoice()
│   └── getNumberInput()
├── Business Logic Layer
│   ├── add()
│   ├── subtract()
│   ├── multiply()
│   └── divide()
└── Control Flow Layer
    ├── runCalculator()
    └── performOperation()
```

## Components and Interfaces

### Main Calculator Class
- **Purpose**: Contains all calculator functionality and serves as the entry point
- **Responsibilities**: 
  - Coordinate user interaction flow
  - Handle input validation
  - Manage application lifecycle

### Core Methods

#### User Interface Methods
- `displayMenu()`: Shows available operations to the user
- `getUserChoice()`: Captures and validates menu selection
- `getNumberInput(String prompt)`: Captures and validates numeric input
- `displayResult(double num1, double num2, char operation, double result)`: Formats and displays calculation results

#### Calculation Methods
- `add(double a, double b)`: Returns sum of two numbers
- `subtract(double a, double b)`: Returns difference of two numbers
- `multiply(double a, double b)`: Returns product of two numbers
- `divide(double a, double b)`: Returns quotient, handles division by zero

#### Control Flow Methods
- `runCalculator()`: Main application loop
- `performOperation(int choice)`: Coordinates input gathering and calculation execution

## Data Models

### Input/Output Data Types
- **Menu Choice**: `int` (1-5 for operations, 5 for exit)
- **Numeric Inputs**: `double` (supports decimal calculations)
- **Operation Results**: `double` (calculation outputs)
- **Operation Symbols**: `char` (+, -, *, /)

### State Management
- **Scanner Instance**: Single Scanner object for all input operations
- **Continue Flag**: `boolean` to control main application loop
- **Current Operation**: Temporary variables for calculation context

## Error Handling

### Input Validation Strategy
1. **Menu Selection Validation**:
   - Check for integer input using `Scanner.hasNextInt()`
   - Validate range (1-5)
   - Clear invalid input from scanner buffer

2. **Numeric Input Validation**:
   - Check for double input using `Scanner.hasNextDouble()`
   - Handle non-numeric strings gracefully
   - Clear invalid input from scanner buffer

3. **Division by Zero Protection**:
   - Check divisor before performing division
   - Return appropriate error message
   - Allow user to retry operation

### Error Recovery Patterns
- **Invalid Input**: Display error message, clear scanner buffer, re-prompt
- **Division by Zero**: Display specific error message, return to main menu
- **Unexpected Errors**: Catch general exceptions, display user-friendly message

## Testing Strategy

### Unit Testing Approach
1. **Calculation Method Tests**:
   - Test each arithmetic operation with various inputs
   - Test edge cases (zero, negative numbers, large numbers)
   - Test division by zero handling

2. **Input Validation Tests**:
   - Test valid and invalid menu choices
   - Test valid and invalid numeric inputs
   - Test boundary conditions

3. **Integration Testing**:
   - Test complete user workflows
   - Test error recovery scenarios
   - Test application lifecycle (start to exit)

### Manual Testing Scenarios
1. **Happy Path Testing**:
   - Perform each operation with valid inputs
   - Test multiple calculations in sequence
   - Test graceful exit

2. **Error Path Testing**:
   - Enter invalid menu choices
   - Enter non-numeric values for calculations
   - Attempt division by zero
   - Test recovery from each error condition

### Test Data Examples
- **Valid Calculations**: 10 + 5, 15.5 - 3.2, 4 * 7, 20 / 4
- **Edge Cases**: 0 + 0, -5 * 3, 100 / 0, 0.1 + 0.2
- **Invalid Inputs**: "abc" for numbers, 99 for menu choice, empty input

## Implementation Notes

### Scanner Management
- Use single Scanner instance throughout application
- Properly handle `nextLine()` vs `nextInt()`/`nextDouble()` buffer issues
- Close Scanner in finally block or use try-with-resources

### User Experience Considerations
- Clear, consistent prompts and messages
- Formatted output for readability
- Intuitive menu numbering (1-4 for operations, 5 for exit)
- Confirmation messages for successful operations

### Code Organization
- Keep methods focused and single-purpose
- Use descriptive method and variable names
- Include appropriate comments for complex logic
- Follow Java naming conventions