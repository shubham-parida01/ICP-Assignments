import java.util.Scanner;
import java.util.InputMismatchException;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luckyNumber;

        System.out.print("Enter your lucky number: ");

        try {
            luckyNumber = scanner.nextInt();

            if (luckyNumber < 0) {
                throw new NumberFormatException("Negative numbers are not allowed as lucky numbers.");
            }

            System.out.println("Your lucky number is: " + luckyNumber);

        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid input. Please enter an integer.");
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
} 