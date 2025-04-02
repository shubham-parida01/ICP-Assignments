// Generic Box Class
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Box contains: " + content;
    }
}

// Main Class for Experiment
public class Question4 {

    public static void main(String[] args) {
        System.out.println("--- String Box Experiment ---");
        Box<String> stringBox1 = new Box<>();
        stringBox1.setContent("Hello");

        Box<String> stringBox2 = stringBox1; // Both variables refer to the same object

        System.out.println("Initial state:");
        System.out.println("stringBox1: " + stringBox1);
        System.out.println("stringBox2: " + stringBox2);

        stringBox1.setContent("World"); // Change content using one variable

        System.out.println("\nAfter changing stringBox1:");
        System.out.println("stringBox1: " + stringBox1);
        System.out.println("stringBox2: " + stringBox2); // The change reflects in the other variable

        System.out.println("\n--- Integer Box Experiment ---");
        Box<Integer> integerBox1 = new Box<>();
        integerBox1.setContent(123);

        Box<Integer> integerBox2 = integerBox1; // Both variables refer to the same object

        System.out.println("Initial state:");
        System.out.println("integerBox1: " + integerBox1);
        System.out.println("integerBox2: " + integerBox2);

        integerBox1.setContent(456); // Change content using one variable

        System.out.println("\nAfter changing integerBox1:");
        System.out.println("integerBox1: " + integerBox1);
        System.out.println("integerBox2: " + integerBox2); // The change reflects in the other variable

        System.out.println("\n--- Object Box Experiment ---");
        Box<Object> objectBox1 = new Box<>();
        Box<Object> objectBox2 = objectBox1;

        System.out.println("Initial state (empty):");
        System.out.println("objectBox1: " + objectBox1);
        System.out.println("objectBox2: " + objectBox2);

        // Put a String in the box
        objectBox1.setContent("A String Object");
        System.out.println("\nAfter putting a String:");
        System.out.println("objectBox1: " + objectBox1);
        System.out.println("objectBox2: " + objectBox2);
        // Verify the type (though it's stored as Object)
        if (objectBox1.getContent() instanceof String) {
            System.out.println("Content is indeed a String.");
        }

        // Put an Integer in the box (replacing the String)
        objectBox1.setContent(789);
        System.out.println("\nAfter putting an Integer:");
        System.out.println("objectBox1: " + objectBox1);
        System.out.println("objectBox2: " + objectBox2);
        // Verify the type
        if (objectBox1.getContent() instanceof Integer) {
            System.out.println("Content is indeed an Integer.");
        }
    }
} 