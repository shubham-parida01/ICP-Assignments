import java.util.Scanner;

public class Question4 {
    static int Factorial(int num){
        if (num == 1){
            return 1;
        }
        return num * Factorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = m ; i<=n ; i++){
            System.out.printf("The factorial of %s is : %s \n" , i , Factorial(i));
        }
    }
}
