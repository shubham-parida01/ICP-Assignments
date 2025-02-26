import java.util.Random;

public class HomeQuestion5 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();

        // Fill the matrix with random 0s and 1s
        System.out.println("Generated 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxRowIndex = 0, maxRowCount = 0;
        int maxColIndex = 0, maxColCount = 0;

        // Find row with most 1s
        for (int i = 0; i < 4; i++) {
            int rowCount = 0;
            for (int j = 0; j < 4; j++) {
                rowCount += matrix[i][j];
            }
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRowIndex = i;
            }
        }

        // Find column with most 1s
        for (int j = 0; j < 4; j++) {
            int colCount = 0;
            for (int i = 0; i < 4; i++) {
                colCount += matrix[i][j];
            }
            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxColIndex = j;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}
