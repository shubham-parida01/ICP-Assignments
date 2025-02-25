import java.util.Scanner;

public class HomeQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your gender (M or F): ");
        char gender = sc.next().charAt(0);
        
        System.out.print("First name: ");
        String firstName = sc.next();
        
        System.out.print("Last name: ");
        String lastName = sc.next();
        
        System.out.print("Age: ");
        int age = sc.nextInt();
        
        if (gender == 'F' || gender == 'f') {
            if (age >= 20) {
                System.out.print("Are you married, " + firstName + " (y or n)? ");
                char married = sc.next().charAt(0);
                if (married == 'y' || married == 'Y') {
                    System.out.println("Then I shall call you Mrs. " + firstName + " " + lastName + ".");
                } else {
                    System.out.println("Then I shall call you Ms. " + firstName + " " + lastName + ".");
                }
            } else {
                System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
            }
        } else if (gender == 'M' || gender == 'm') {
            if (age >= 20) {
                System.out.println("Then I shall call you Mr. " + firstName + " " + lastName + ".");
            } else {
                System.out.println("Then I shall call you " + firstName + " " + lastName + ".");
            }
        }

    }
}
