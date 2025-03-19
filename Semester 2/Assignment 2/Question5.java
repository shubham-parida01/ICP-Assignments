abstract class Shape {
    abstract void area();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

public class Question5 {
    public static void main(String[] args) {
        Square s = new Square(4);
        Triangle t = new Triangle(5, 3);
        Circle c = new Circle(6);

        s.area();
        t.area();
        c.area();
    }
}
