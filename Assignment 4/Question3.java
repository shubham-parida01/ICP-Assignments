import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int random ;
        int res = 0;
        for ( int i = 0;i<n ; i++){
            random = (int)(Math.random()*(n-1)) + 1;
            System.out.print(random+" ");
            res += random;
        }
        res /= n;
        System.out.println();
        System.out.println("Average of "+n+ " random numbers are "+res);
    }
}
