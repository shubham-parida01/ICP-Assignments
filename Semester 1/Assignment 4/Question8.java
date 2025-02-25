import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random() * 9 )+ 1;
        System.out.println("Computer Guess: "+random);
        while (true){
            System.out.print("User Guess: ");
            int guess = sc.nextInt(); 
            if ( guess == random){
                System.out.println("Good guess");
                break;
            } else if (guess > random){
                System.out.println("Too high , try again");
            } else {
                System.out.println("Too low , try again");
            }
        }
    }
}
