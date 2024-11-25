import java.util.Scanner;

public class HomeQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter today's day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday): ");
        int today = sc.nextInt();
        
        System.out.print("Enter the number of days after today: ");
        int daysAfter = sc.nextInt();
        
        int futureDay = (today + daysAfter) % 7;
        
        System.out.println("The future day of the week is: " + futureDay);

    }
}
