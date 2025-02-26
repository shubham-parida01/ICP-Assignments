import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows and Columns of 2D-Array: ");
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] arr = new int[m][n];
        int sum = 0;

        System.out.println("Enter elements of 2D-Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        sc.close();

        System.out.println("The elements of 2D array are:");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of elements of the 2D-Array is " + sum);
    }
}
