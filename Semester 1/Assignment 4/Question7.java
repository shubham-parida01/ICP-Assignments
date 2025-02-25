import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.printf("The multiplication table of %s is :\n" , num);
        for (int i = 1 ; i <= 10 ;i++){
            System.out.printf("%s x %s = %s \n" , num , i , num*i);
        }
    }
}
