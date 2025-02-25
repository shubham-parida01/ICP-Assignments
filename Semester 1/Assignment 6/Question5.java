import java.util.Scanner;

public class Question5 {
    public static double area(int n, double side){
        double area =  (n * side *side) / (4*Math.tan(Math.PI / n));
        return area ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numOfSides = sc.nextInt();
        System.out.print("Enter the length of each side :");
        int side = sc.nextInt();
        System.out.println("Area of the polygon is : " + area(numOfSides, side));
    }
}
