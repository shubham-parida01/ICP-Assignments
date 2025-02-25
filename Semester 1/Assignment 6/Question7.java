import java.util.Scanner;

public class Question7 {
    public static int count(String str){
        int count = 0;
        String val = str.toLowerCase();
        for(int i = 0 ; i < str.length() ; i++){
            if (val.charAt(i) == 'a' || val.charAt(i) == 'e' || val.charAt(i) == 'i'|| val.charAt(i) == 'o' || val.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.println("Number of vowels in " + str + " is "+ count(str));
    }
}