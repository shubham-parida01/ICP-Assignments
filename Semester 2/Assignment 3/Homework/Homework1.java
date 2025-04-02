import java.util.Scanner;

public class Homework1 {

    // Recursive method for greatest common divisor (GCD)
    // gcd(m, n) = gcd(n, m mod n)
    public static int gcd(int m, int n) {
        // Ensure n is non-negative for the modulo operation
        if (n < 0) n = -n;
        if (m < 0) m = -m;

        // Base case: if n is 0, gcd is m
        if (n == 0) {
            return m;
        }
        // Recursive step
        else {
            return gcd(n, m % n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer (m): ");
            int m = scanner.nextInt();

            System.out.print("Enter the second integer (n): ");
            int n = scanner.nextInt();

            int result = gcd(m, n);
            System.out.println("The greatest common divisor (GCD) of " + m + " and " + n + " is: " + result);

        } catch (Exception e) {
            System.err.println("Invalid input. Please enter two integers.");
        }
        scanner.close();
    }
} 