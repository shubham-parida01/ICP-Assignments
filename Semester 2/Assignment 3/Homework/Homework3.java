import java.util.Scanner;

public class Homework3 {

    // Recursive method to find the binary equivalent of a positive decimal integer
    // Returns the binary string
    public static String decimalToBinary(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        // Base case: if n is 0, its binary representation is "0"
        // Base case: if n is 1, its binary representation is "1"
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        }
        // Recursive step:
        // Binary of n = (Binary of n/2) + (n % 2)
        else {
            return decimalToBinary(n / 2) + (n % 2);
        }
    }

     // Alternative: A void method that prints bits directly (in correct order)
     public static void printBinary(int n) {
         if (n < 0) {
             System.out.print("-"); // Handle negative sign if needed
             printBinary(-n);
             return;
         }
         // Base case: Stop recursion when n becomes 0
         if (n == 0) {
             return; // Or print 0 if the original number was 0
         }
         // Recursive step: Process n/2 first, then print n%2
         printBinary(n / 2);
         System.out.print(n % 2);
     }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a positive decimal integer: ");
            int decimal = scanner.nextInt();

            if (decimal < 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                // Using the method that returns a string
                String binaryString = decimalToBinary(decimal);
                System.out.println("Binary equivalent (string): " + binaryString);

                // Using the method that prints directly
                System.out.print("Binary equivalent (printed): ");
                if (decimal == 0) {
                    System.out.print("0"); // Handle the zero case for printBinary
                }
                printBinary(decimal);
                System.out.println();
            }

        } catch (Exception e) {
            System.err.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
} 