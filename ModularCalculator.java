import java.util.Scanner;

/**
 * Modular Calculator Application
 * Demonstrates method design, overloading, exception handling,
 * pass-by-value, and reusable methods.
 */
public class ModularCalculator {

    // Reusable Scanner object
    static Scanner sc = new Scanner(System.in);

    // ---------------- Utility Method ----------------
    // Method to take integer input
    static int getIntInput(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // ---------------- Calculator Methods ----------------

    // Addition (int)
    static int add(int a, int b) {
        return a + b;
    }

    // Addition (double) - Method Overloading
    static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Division with Exception Handling
    static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // ---------------- Pass-by-Value Demonstration ----------------
    static void changeValue(int x) {
        x = 100;
        System.out.println("Value inside method: " + x);
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {

        System.out.println("===== Modular Calculator =====");

        int num1 = getIntInput("Enter first number: ");
        int num2 = getIntInput("Enter second number: ");

        // Testing each method
        System.out.println("Addition (int): " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));

        // Testing divide with exception handling
        try {
            System.out.println("Division: " + divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Method Overloading Test
        System.out.println("Addition (double): " + add(5.5, 4.5));

        // Pass-by-Value Test
        int value = 50;
        System.out.println("Value before method call: " + value);
        changeValue(value);
        System.out.println("Value after method call: " + value);

        System.out.println("===== Program Ended =====");
    }
}