import java.util.Scanner;

class Car{
    String model;
    int year;

    void setDetails(String modelDetail , int year){
        this.model = modelDetail;
        this.year = year;
    }

    void displayDetails(){
        System.out.println(this.model);
        System.out.println(this.year);
    }
}

public class Question1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car1 = new Car();
        Car car2 = new Car();

        car1.model = "Toyota";
        car1.year = 2020;
        
        System.out.print("Enter Model of Car 2: ");
        String model = input.next();
        System.out.print("Enter year of make of Car 2:");
        int year = input.nextInt();
        System.out.println();;

        car2.setDetails(model , year);

        car1.displayDetails();
        System.out.println();
        car2.displayDetails();

        if(car1.year < car2.year){
            System.out.println("Car 2 is newer");
        } else {
            System.out.println("Car 1 is newer");
        }
    }
}