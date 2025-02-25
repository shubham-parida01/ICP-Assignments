import java.util.Scanner;

public class HomeQuestion3 {
    static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x (in radians): ");
        double x = sc.nextDouble();

        double sinValue = 0; 
        double term;         
        int n = 1;           
        int sign = 1;        

        do {
            term = sign * Math.pow(x, n) / Factorial(n); 
            sinValue += term; 
            sign *= -1;       
            n += 2;           
        } while (Math.abs(term) >= Math.pow(10, -6)); 

        System.out.println("Sin(x) = " + sinValue);
    }
}
