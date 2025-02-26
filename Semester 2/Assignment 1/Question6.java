import java.util.Scanner;

public class Question6 {
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        
        System.out.println(num + " is odd: " + isOdd(num));
    }
}
