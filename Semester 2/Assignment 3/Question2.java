public class Question2 {

    public static void main(String[] args) {
        String[] favoriteColors = {"Red", "Blue", "Green", "Yellow"};

        try {
            System.out.println("Accessing element at index 5...");
            String color = favoriteColors[5];
            System.out.println("Color at index 5: " + color);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught Exception: " + e);
            System.err.println("Reason: Attempted to access an index outside the array bounds.");
        }

        System.out.println("\n--------------------\n");

        favoriteColors[1] = null;
        try {
            System.out.println("Accessing properties of element at index 1...");
            int length = favoriteColors[1].length();
            System.out.println("Length of color at index 1: " + length);
        } catch (NullPointerException e) {
            System.err.println("Caught Exception: " + e);
            System.err.println("Reason: Attempted to access a member of a null object reference.");
        }
    }
} 