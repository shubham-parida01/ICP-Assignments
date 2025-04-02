public class Question5 {

    // Generic method printArray
    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        System.out.print("[");
        for(int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i < inputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "Apple", "Banana", "Cherry" };

        System.out.println("Integer Array contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nDouble Array contains:");
        printArray(doubleArray); // pass a Double array

        System.out.println("\nCharacter Array contains:");
        printArray(charArray); // pass a Character array

        System.out.println("\nString Array contains:");
        printArray(stringArray); // pass a String array
    }
} 