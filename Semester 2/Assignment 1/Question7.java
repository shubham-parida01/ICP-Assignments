import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = arr[0], min = arr[0], maxCount = 0, minCount = 0;
        int maxFirstPos = -1, minLastPos = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxCount = 1;
                maxFirstPos = i + 1;
            } else if (arr[i] == max) {
                maxCount++;
            }

            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
                minLastPos = i + 1;
            } else if (arr[i] == min) {
                minCount++;
                minLastPos = i + 1;
            }
        }

        System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + maxFirstPos + ".");
        System.out.println("Last occurrence of minimum element is at position " + minLastPos + ".");
    }
}
