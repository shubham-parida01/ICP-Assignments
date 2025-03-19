class Vehicle {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    private int carId;
    private double price;

    public Car(String model, int year, int carId, double price) {
        super(model, year);
        this.carId = carId;
        this.price = price;
    }

    public void carDisplay() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Car ID: " + carId);
        System.out.println("Price: " + price);
    }
}

public class Question6 {
    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2022, 101, 30000);
        car.carDisplay();
    }
}
