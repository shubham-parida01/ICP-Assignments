interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    public void displayDetails() {
        System.out.println("Duck Name: " + name);
        fly();
        swim();
    }
}

public class Question8 {
    public static void main(String[] args) {
        Duck d = new Duck("Daffy");
        d.displayDetails();
    }
}
