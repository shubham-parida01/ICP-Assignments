import java.util.Scanner;

public class Question7 {

    // Recursive method to compute factorial
    public static long factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n < 0) {
            // Factorial is not defined for negative numbers
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive step: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        try {
            int number = scanner.nextInt();
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
} 