import java.util.Scanner;

public class Question6 {
    public static int count(String str, char a){
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.printf("Number of %s in %s is %s" , ch , str , count(str, ch));
    }
}
