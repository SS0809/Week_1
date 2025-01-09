import java.util.Scanner;

public class Calculator {
    public Float addition(Float operand1, Float operand2) {//calculating addition
        return operand1 + operand2;
    }

    public Float substraction(Float operand1, Float operand2) {//calculating substraction
        return operand1 - operand2;
    }

    public Float multiplication(Float operand1, Float operand2) {//calculating multiplication
        return operand1 * operand2;
    }

    public Float division(Float operand1, Float operand2) {//calculating division
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        Float num1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        Float num2 = scanner.nextFloat();

        Calculator calculator = new Calculator();

        System.out.println("\nAddition: " + calculator.addition(num1, num2));
        System.out.println("Subtraction: " + calculator.substraction(num1, num2));
        System.out.println("Multiplication: " + calculator.multiplication(num1, num2));
        System.out.println("Division: " + calculator.division(num1, num2));

        scanner.close();
    }
}