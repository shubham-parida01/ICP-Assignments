import java.util.Scanner;

public class Question9 {

    // Recursive method to print digits of n in reverse
    public static void printReverse(int n) {
        // Handle negative numbers (optional, can print sign first or treat as positive)
        if (n < 0) {
            System.out.print("-");
            printReverse(-n); // Recurse with the positive version
            return;
        }

        // Base case: if n is a single digit, print it
        if (n < 10) {
            System.out.print(n);
        } else {
            // Recursive step:
            // 1. Print the last digit (n % 10)
            System.out.print(n % 10);
            // 2. Recurse with the remaining digits (n / 10)
            printReverse(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            System.out.print("Reversed: ");
            printReverse(number);
            System.out.println(); // Add a newline after printing

        } catch (Exception e) {
            System.err.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
} 