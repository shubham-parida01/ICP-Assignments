class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class Question7 {
    public static void main(String[] args) {
        Circle c = new Circle("Red", 5);
        Rectangle r = new Rectangle("Blue", 4, 6);

        c.display();
        r.display();
    }
}
