import java.util.Scanner;

public class Homework5 {

    // Recursive method to reverse a string
    public static String reverseString(String s) {
        // Base case: if the string is null or has 0 or 1 character, it's its own reverse
        if (s == null || s.length() <= 1) {
            return s;
        }
        // Recursive step: Reverse the substring excluding the first character,
        // then append the first character to the end.
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();

        String reversed = reverseString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Example from question
        String example = "pots&pans";
        System.out.println("\nExample:");
        System.out.println("Original: " + example);
        System.out.println("Reversed: " + reverseString(example)); // Expected: snap&stop

        scanner.close();
    }
} 