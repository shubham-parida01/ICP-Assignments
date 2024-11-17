import java.util.Scanner;

public class lab2home3 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X1:");
		double x1 = sc.nextDouble();
		System.out.print("Enter Y1:");
		double y1 = sc.nextDouble();
		System.out.print("Enter X2:");
		double x2 = sc.nextDouble();
		System.out.print("Enter Y2:");
		double y2 = sc.nextDouble();
		System.out.print("Enter X3:");
		double x3 = sc.nextDouble();
		System.out.print("Enter Y3:");
		double y3 =  sc.nextDouble();
		double val = (x1*(y2-y3)) + (x2*(y3-y1)) + (x3*(y1-y2));
		System.out.println("Area of triangle is : " + (0.5 * Math.abs(val)));
	}
}
