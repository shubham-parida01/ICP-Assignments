import java.util.Scanner;

public class Homework8 {

    // Recursive method to solve the Towers of Hanoi puzzle
    // Moves n disks from source peg to destination peg using auxiliary peg.
    public static void towersOfHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: If there is only 1 disk, move it directly from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + source + " to peg " + destination);
            return;
        }

        // Recursive step 1: Move the top n-1 disks from source to auxiliary peg,
        // using destination as the auxiliary peg for this subproblem.
        towersOfHanoi(n - 1, source, auxiliary, destination);

        // Step 2: Move the nth (largest) disk from source to destination peg.
        System.out.println("Move disk " + n + " from peg " + source + " to peg " + destination);

        // Recursive step 3: Move the n-1 disks from auxiliary peg to destination peg,
        // using source as the auxiliary peg for this subproblem.
        towersOfHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of disks (n): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Number of disks must be positive.");
            } else {
                System.out.println("\nSolving Towers of Hanoi for " + n + " disks:");
                // Standard peg names: A (source), C (destination), B (auxiliary)
                towersOfHanoi(n, 'A', 'C', 'B');
            }

        } catch (Exception e) {
            System.err.println("Invalid input. Please enter a positive integer.");
        }
        scanner.close();
    }
} 