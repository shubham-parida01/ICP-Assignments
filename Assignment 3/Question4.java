import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int max = 9;
        int computerGuess = (int)(Math.random() * (max-min+1)+min);
        System.out.print("Enter user number: ");
        int userGuess = sc.nextInt();
        System.out.println("Computer Guesses: "+computerGuess);
        if (computerGuess == userGuess){
            System.out.println("You got it right");
        } else if (computerGuess == (userGuess+1) || computerGuess == (userGuess+1)){
            System.out.println("Almost got it");
        } else {
            System.out.println("You got it wrong");
        }
    }
}
