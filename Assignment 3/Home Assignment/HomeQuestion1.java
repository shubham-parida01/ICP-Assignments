import java.util.Scanner;

public class HomeQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] choices = {"Scissor", "Rock", "Paper"};
        
        int computerChoice = (int) (Math.random() * 3);
        
        System.out.println("Enter your choice (0 = Scissor, 1 = Rock, 2 = Paper): ");
        int userChoice = sc.nextInt();
        
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid input! Please enter 0, 1, or 2.");
        } else {            
            if (userChoice == computerChoice) {
                System.out.println("The computer is " + computerChoice + ".You are " + userChoice + ".It's a draw!");
            } else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1)) {
                System.out.println("The computer is " + computerChoice + ".You are " + userChoice + ".You win!");
            } else {
                System.out.println("The computer is " + computerChoice + ".You are " + userChoice + ".You lose!");
            }
        }

    }
}
