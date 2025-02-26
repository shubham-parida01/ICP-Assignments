import java.util.Scanner;

public class HomeQuestion3 {
    public static int[] dotProduct(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] a = new int[n], b = new int[n];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        sc.close();

        int[] c = dotProduct(a, b);
        System.out.println("Dot product array:");
        for (int value : c) System.out.print(value + " ");
    }
}
