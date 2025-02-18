import java.util.Scanner;

public class ControlStructure {
    public static void main (String[] args) {
        Calculator();
    }
        public static void Calculator()
        {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result;
            
            if (operator == '+') {
                result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            } else {
                System.out.println("Error: Invalid operator.");
            }
            
            scanner.close();
        }
    }
    
  


