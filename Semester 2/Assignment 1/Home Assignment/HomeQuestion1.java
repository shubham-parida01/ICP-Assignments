import java.util.Scanner;

public class HomeQuestion1 {
    public static boolean isValidFormula(int a, int b, int c) {
        return (a + b == c) || (a == b - c) || (a * b == c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers (a, b, c): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println("Can be used in a correct arithmetic formula: " + isValidFormula(a, b, c));
    }
}
