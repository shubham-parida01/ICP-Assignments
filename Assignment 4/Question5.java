import java.util.Scanner;
public class Question5 {
    static int FactorSum(int num){
        int sum = 0;
        for (int i = 0 ; i<=Math.sqrt(num) ; i++){
            if (num%i == 0){
                if (i != num/i && i !=1){
                    sum += (i+num/i);
                }
                else {
                    sum += i;
                }
        }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n == FactorSum(n)){
            System.out.printf("%s is a perfect number" , n);
        } else {
            System.out.printf("%s is not a perfect number" , n);
        }
    }
}
