// Custom Exception Class
class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}

// Student Class
class Student {
    private String name;
    private int mark;

    public Student(String name, int mark) throws MarksOutOfBoundException {
        if (mark > 100) {
            throw new MarksOutOfBoundException("Mark cannot be greater than 100. Invalid mark: " + mark);
        }
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", mark=" + mark + "]";
    }
}

// Main Class to test
public class Question3 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("Alice", 85);
            System.out.println("Student created successfully: " + student1);

            // This will throw the exception
            Student student2 = new Student("Bob", 105);
            System.out.println("Student created successfully: " + student2); // This line won't be reached

        } catch (MarksOutOfBoundException e) {
            System.err.println("Error creating student: " + e.getMessage());
        }

        System.out.println("\nTrying with another valid mark:");
        try {
            Student student3 = new Student("Charlie", 99);
            System.out.println("Student created successfully: " + student3);
        } catch (MarksOutOfBoundException e) {
            System.err.println("Error creating student: " + e.getMessage()); // This shouldn't happen here
        }
    }
} 