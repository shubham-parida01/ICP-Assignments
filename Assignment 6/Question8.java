import java.util.Scanner;;

public class Question8 {
    public static boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return str.equals(rev.toString());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        if (isPalindrome(str)){
            System.out.println(str+" is a palindrome");
        } else {
            System.out.println(str+" is not a palindrome");
        }
    }
}
