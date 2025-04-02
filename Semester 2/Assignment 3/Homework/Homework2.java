import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

    // Recursive binary search method
    // Returns the index of the element if found, otherwise -1
    public static int binarySearchRecursive(int[] sortedArray, int key, int low, int high) {
        if (low > high) {
            // Base case: Element not found
            return -1;
        }

        int mid = low + (high - low) / 2; // Avoid potential overflow

        if (sortedArray[mid] == key) {
            // Base case: Element found at mid
            return mid;
        } else if (sortedArray[mid] < key) {
            // Recursive step: Search in the right half
            return binarySearchRecursive(sortedArray, key, mid + 1, high);
        } else { // sortedArray[mid] > key
            // Recursive step: Search in the left half
            return binarySearchRecursive(sortedArray, key, low, mid - 1);
        }
    }

    // Helper method to start the recursion
    public static int binarySearch(int[] sortedArray, int key) {
        return binarySearchRecursive(sortedArray, key, 0, sortedArray.length - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example sorted array
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("Sorted array: " + Arrays.toString(array));

        try {
            System.out.print("Enter the element to search for: ");
            int key = scanner.nextInt();

            int index = binarySearch(array, key);

            if (index != -1) {
                System.out.println("Element " + key + " found at index: " + index);
            } else {
                System.out.println("Element " + key + " not found in the array.");
            }

        } catch (Exception e) {
            System.err.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
} 