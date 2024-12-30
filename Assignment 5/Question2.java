import java.util.Scanner;

public class Question2 {
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
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int val = num;
        int rev = 0;
        while (num>0){
            rev *= 10;
            rev += num%10;
            num/=10;
        }
        if (isPrime(rev) && isPrime(val)){
            System.out.printf("%s is a twisted prime" , val);
        } else {
            System.out.printf("%s is not a twisted prime" , val);
        }
    }
}
