import java.util.Scanner;

public class Question8 {

    // Recursive method to compute x^n
    public static double power(double x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1.0;
        }
        // Handle negative exponent: x^-n = 1 / (x^n)
        else if (n < 0) {
            return 1.0 / power(x, -n);
        }
        // Recursive step for positive exponent: x^n = x * x^(n-1)
        else {
            return x * power(x, n - 1);
        }
        /* // Alternative recursive step (more efficient for large n)
           else if (n % 2 == 0) { // n is even
               double temp = power(x, n / 2);
               return temp * temp;
           } else { // n is odd
               double temp = power(x, (n - 1) / 2);
               return x * temp * temp;
           }
        */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the base value (x): ");
            double x = scanner.nextDouble();

            System.out.print("Enter the exponent (n, an integer): ");
            int n = scanner.nextInt();

            double result = power(x, n);
            System.out.println(x + " raised to the power of " + n + " is: " + result);

        } catch (Exception e) {
            System.err.println("Invalid input. Please enter a numeric base and an integer exponent.");
        }
        scanner.close();
    }
} 