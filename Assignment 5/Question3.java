import java.util.Scanner;

public class Question3 {
    static boolean isPrime(int num){
        for (int i = 2; i<= Math.sqrt(num) ; i++){
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        System.out.printf("Prime numbers between %s and %s are: ",first , second);
        for (int i = first ; i <= second ; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            } 
        }
        
    }
}
