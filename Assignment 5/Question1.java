import java.util.Scanner;

public class Question1 {
    static int FactorSum(int num){
        int sum = 0;
        for (int i = 1 ; i<=Math.sqrt(num);i++){
            if (num%i == 0){
                if (i != 1 && i != num/i){
                    sum += (i+num/i);
                } else {
                    sum += i;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (FactorSum(second) == first && FactorSum(first) == second){
            System.out.printf("%s and %s are amicable numbers" , first , second);
        } else {
            System.out.printf("%s and %s are not amicable numbers" , first , second);
        }
    }
}
