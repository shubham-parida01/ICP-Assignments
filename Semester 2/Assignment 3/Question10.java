import java.util.Scanner;

public class Question10 {

    // Recursive method to compute the nth Fibonacci number
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative indices.");
        }
        // Base cases: F(0) = 0 (or sometimes 1, depending on definition, assignment uses 1, 1, 2...), F(1) = 1
        // Let's adjust for the sequence 1, 1, 2, 3, 5... where F(1)=1, F(2)=1
        if (n == 1 || n == 2) {
            return 1;
        }
        // Handle the F(0) case if needed, though the sequence starts 1, 1...
        // If we needed F(0) = 0, the base case would be:
         if (n <= 0) { // Adjust if F(0) needs to be 0
             return 0; // Or throw exception if n=0 is invalid based on 1, 1, 2... start
         } else if (n == 1) {
             return 1;
         }

        // Recursive step: F(n) = F(n-1) + F(n-2)
        // Note: This recursive implementation is very inefficient for larger n due to repeated calculations.
        // Iterative or memoized recursive solutions are preferred for performance.
        // Re-adjusting base cases for the sequence 1, 1, 2, 3, 5...
        if (n <= 0) {
             throw new IllegalArgumentException("Index must be positive for the sequence 1, 1, 2...");
        } else if (n == 1 || n == 2) { // F(1) = 1, F(2) = 1
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the position (n) in the Fibonacci sequence (1, 1, 2, 3...): ");
            int n = scanner.nextInt();

            long result = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);

        } catch (IllegalArgumentException e) {
             System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter a positive integer.");
        }
        scanner.close();
    }
} 