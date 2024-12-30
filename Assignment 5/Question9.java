import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        double sum = 0;
        for(int i = 1; i<=num ; i++){
            sum += (1.0/(i*i));
        }

        System.out.println(sum);
    }
}
