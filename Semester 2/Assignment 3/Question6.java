import java.util.Objects; // Needed for Objects.equals

public class Question6 {

    // Generic method to count occurrences of an element
    public static <T> int count(T[] array, T item) {
        int counter = 0;
        if (item == null) { // Handle counting null elements
            for (T element : array) {
                if (element == null) {
                    counter++;
                }
            }
        } else { // Handle counting non-null elements
            for (T element : array) {
                // Use Objects.equals for null-safe comparison
                if (Objects.equals(item, element)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        // Example with Integers
        Integer[] intArray = {1, 5, 3, 5, 2, 5, 4, 5};
        int countInt = count(intArray, 5);
        System.out.println("Count of 5 in intArray: " + countInt); // Expected: 4

        // Example with Strings
        String[] stringArray = {"apple", "banana", "apple", "orange", "apple"};
        int countString = count(stringArray, "apple");
        System.out.println("Count of \"apple\" in stringArray: " + countString); // Expected: 3

        // Example with Strings and case sensitivity
        String[] mixedCaseArray = {"Apple", "apple", "APPLE"};
        int countCase = count(mixedCaseArray, "apple");
        System.out.println("Count of \"apple\" (case-sensitive) in mixedCaseArray: " + countCase); // Expected: 1

        // Example with null
        String[] arrayWithNulls = {"a", null, "b", null, "a", null};
        int countNull = count(arrayWithNulls, null);
        System.out.println("Count of null in arrayWithNulls: " + countNull); // Expected: 3
        int countA = count(arrayWithNulls, "a");
        System.out.println("Count of \"a\" in arrayWithNulls: " + countA); // Expected: 2

    }
} 