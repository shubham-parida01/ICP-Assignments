import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = n;
        int random;
        int res = 0;
        int i = 0;

        System.out.println("Generated random numbers:");

        do {
            random = (int) (Math.random() * 100) + 1;
            System.out.print(random + " ");
            res += random;
            i++;
        } while (i < count);

        double average = (double) res / count;
        System.out.println();
        System.out.println("Average of " + count + " random numbers is " + average);
    }
}
