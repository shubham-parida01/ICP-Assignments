import java.util.Scanner;

public class HomeQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        boolean divisibleBy5And6 = (number % 5 == 0) && (number % 6 == 0);
        boolean divisibleBy5Or6 = (number % 5 == 0) || (number % 6 == 0);
        boolean divisibleBy5Or6ButNotBoth = (number % 5 == 0 || number % 6 == 0) && !(number % 5 == 0 && number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6? " + divisibleBy5And6);
        System.out.println("Is " + number + " divisible by 5 or 6? " + divisibleBy5Or6);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + divisibleBy5Or6ButNotBoth);

    }
}
