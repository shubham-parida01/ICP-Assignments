import java.util.Scanner;

public class Homework6 {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        // Preprocess: remove spaces and convert to lower case (optional, depends on definition)
        // String processed = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // return isPalindromeRecursive(processed);

        // Using the original string directly as per examples like 'racecar'
        return isPalindromeRecursive(s);
    }

    // Helper recursive function
    private static boolean isPalindromeRecursive(String s) {
        int len = s.length();

        // Base case 1: Empty or single-character string is a palindrome
        if (len <= 1) {
            return true;
        }
        // Base case 2: If first and last characters don't match, it's not a palindrome
        if (s.charAt(0) != s.charAt(len - 1)) {
            return false;
        }
        // Recursive step: Check the substring excluding the first and last characters
        return isPalindromeRecursive(s.substring(1, len - 1));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }

        // Examples from question
        System.out.println("\nExamples:");
        String ex1 = "racecar";
        String ex2 = "gohangasalamiimalasagnahog";
        String ex3 = "hello";
        System.out.println("'" + ex1 + "': " + isPalindrome(ex1)); // true
        System.out.println("'" + ex2 + "': " + isPalindrome(ex2)); // true
        System.out.println("'" + ex3 + "': " + isPalindrome(ex3)); // false

        scanner.close();
    }
}
