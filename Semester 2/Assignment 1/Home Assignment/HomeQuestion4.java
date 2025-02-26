import java.util.Scanner;

public class HomeQuestion4 {
    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length, cols = a[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        double[][] a = new double[rows][cols];
        double[][] b = new double[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextDouble();

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                b[i][j] = sc.nextDouble();
        sc.close();

        double[][] result = addMatrix(a, b);
        System.out.println("Sum of matrices:");
        for (double[] row : result) {
            for (double val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
