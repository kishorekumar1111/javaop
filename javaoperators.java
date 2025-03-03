import java.util.Scanner;

class JavaOperators {

    public static void main(String[] args) {
        // Call each method to demonstrate different operators
        arithmeticOperations();
        relationalOperators();
        logicalOperators();
        bitwiseOperators();
    }

    // Arithmetic Operators
    public static void arithmeticOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers for Arithmetic Operations: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println(); // Blank line for separation
    }

    // Relational Operators
    public static void relationalOperators() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers for Relational Operations: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        System.out.println(); // Blank line for separation
    }

    // Logical Operators
    public static void logicalOperators() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for Logical Operations: ");
        int num = scanner.nextInt();

        boolean isDivisible = (num % 3 == 0) && (num % 5 == 0);
        System.out.println("Divisible by both 3 and 5: " + isDivisible);

        System.out.println(); // Blank line for separation
    }

    // Bitwise Operators
    public static void bitwiseOperators() {
        int a = 5, b = 3;
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("b >> 1: " + (b >> 1));
    }
}
