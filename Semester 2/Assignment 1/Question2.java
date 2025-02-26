import java.util.Scanner;

public class Question2 {
    public static float bmi(float weight , float height){
        return weight / (height*height);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person Weight in kg: ");
        float weight = sc.nextFloat();
        System.out.print("Enter height of person in meter: ");
        float height = sc.nextFloat();
        System.out.print("The person is ");
        float personBMI = bmi(weight, height);
        if (personBMI < 18.5){
            System.out.print("Underweight");
        } else if (personBMI <= 24.9){
            System.out.print("Normal Weight");
        } else if (personBMI <= 29.9){
            System.out.print("Overweight");
        } else {
            System.out.print("Obese");
        }

    }
}
