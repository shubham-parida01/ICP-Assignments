import java.util.Scanner;

public class Question3 {
    public static int reverse(int number){
        int rev = 0;
        while(number >0){
            rev *=10;
            rev += (number%10);
            number /=10;
        }
        return rev;
    }
    public static boolean isPalindrome(int number){
        if (number == reverse(number)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)){
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
