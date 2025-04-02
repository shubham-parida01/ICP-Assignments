import java.util.Arrays;

public class Homework7 {

    // Recursive method to rearrange the array
    // Elements <= k come before elements > k
    // Uses a two-pointer approach (low and high) within the recursion
    public static void rearrange(int[] A, int k, int low, int high) {
        // Base case: If pointers cross or meet, the partition for this segment is done
        if (low >= high) {
            return;
        }

        // If the element at low is already in the correct partition (<= k),
        // move the low pointer forward and recurse.
        if (A[low] <= k) {
            rearrange(A, k, low + 1, high);
        }
        // If the element at high is already in the correct partition (> k),
        // move the high pointer backward and recurse.
        else if (A[high] > k) {
            rearrange(A, k, low, high - 1);
        }
        // If A[low] > k and A[high] <= k, they are in the wrong partitions.
        // Swap them, then move both pointers inward and recurse.
        else {
            // Swap A[low] and A[high]
            int temp = A[low];
            A[low] = A[high];
            A[high] = temp;

            rearrange(A, k, low + 1, high - 1);
        }
    }

    // Helper method to start the recursion
    public static void rearrangeArray(int[] A, int k) {
        if (A == null || A.length == 0) {
            return;
        }
        rearrange(A, k, 0, A.length - 1);
    }

    public static void main(String[] args) {
        int[] A = {15, 3, 9, 11, 2, 20, 5, 8, 12};
        int k = 10;

        System.out.println("Original array: " + Arrays.toString(A));
        System.out.println("Rearranging around k = " + k);

        rearrangeArray(A, k);

        System.out.println("Rearranged array: " + Arrays.toString(A));
        // Expected output: An array where elements <= 10 are first, followed by elements > 10
        // Example: [8, 3, 9, 5, 2, 20, 11, 15, 12] (order within partitions may vary)

        int[] B = {1, 2, 3, 4, 5};
        k = 3;
        System.out.println("\nOriginal array: " + Arrays.toString(B));
        System.out.println("Rearranging around k = " + k);
        rearrangeArray(B, k);
        System.out.println("Rearranged array: " + Arrays.toString(B)); // Expected: [1, 2, 3, 4, 5]

        int[] C = {10, 9, 8, 7, 6};
        k = 7;
        System.out.println("\nOriginal array: " + Arrays.toString(C));
        System.out.println("Rearranging around k = " + k);
        rearrangeArray(C, k);
        System.out.println("Rearranged array: " + Arrays.toString(C)); // Expected: [7, 6, 8, 9, 10] or similar
    }
} 