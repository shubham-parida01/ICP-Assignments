import java.util.Scanner;

public class Question8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter the y-coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("The point lies at the origin.");
        } else if (x == 0) {
            System.out.println("The point lies on the y-axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the x-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("The point is in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in Quadrant IV.");
        }
    }
}