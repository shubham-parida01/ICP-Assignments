import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = sc.nextInt();
        System.out.print("Enter the third number (c): ");
        int c = sc.nextInt();
        int largest, secondLargest;

        if (a >= b && a >= c) {
            largest = a;
            secondLargest = (b > c) ? b : c;
        } else if (b >= a && b >= c) {
            largest = b;
            secondLargest = (a > c) ? a : c;
        } else {
            largest = c;
            secondLargest = (a > b) ? a : b;
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);
    }
}
