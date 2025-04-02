import java.util.Scanner;

public class Homework4 {

    // Recursive method to find the product of two numbers (a * b)
    // Assuming b >= 0 for simplicity in this basic recursion
    // Handles negative 'a' correctly. For negative 'b', use product(a, -b) and negate result.
    public static int productRecursive(int a, int b) {
        // Base case: if b is 0, the product is 0
        if (b == 0) {
            return 0;
        }
        // Handle negative b: a * (-b) = -(a * b)
        else if (b < 0) {
             return -productRecursive(a, -b);
        }
        // Recursive step: a * b = a + a * (b - 1)
        else {
            return a + productRecursive(a, b - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer (a): ");
            int a = scanner.nextInt();

            System.out.print("Enter the second integer (b): ");
            int b = scanner.nextInt();

            int result = productRecursive(a, b);
            System.out.println("The product of " + a + " and " + b + " is: " + result);

        } catch (Exception e) {
            System.err.println("Invalid input. Please enter two integers.");
        }
        scanner.close();
    }
} 