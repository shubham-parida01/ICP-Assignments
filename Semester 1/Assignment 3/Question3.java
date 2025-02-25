import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input First Number: ");
        int first = sc.nextInt();
        System.out.print("Input Second Number: ");
        int second = sc.nextInt();
        System.out.print("Input Third Number: ");
        int third = sc.nextInt();

        if (first<second && second<third){
            System.out.println("Increasing");
        } else if (first>second && second>third) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
    }
}
