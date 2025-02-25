import java.util.Scanner;

class GCD {
    int gcd(int a , int b){
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        GCD res = new GCD();
        System.out.printf("GCD of %s and %s is %s",num1,num2 , res.gcd(num1, num2));

    
    }
}
