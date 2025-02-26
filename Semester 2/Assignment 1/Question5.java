import java.util.Scanner;

public class Question5 {
    public static int sum_Of_Digits(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        int result = sum_Of_Digits(num);
        System.out.println("Sum of digits of " + num + " until the number is a single digit is " + result);
    }
}
