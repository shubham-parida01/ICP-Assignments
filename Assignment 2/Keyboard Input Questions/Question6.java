import java.util.Scanner;

public class Question6 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of seconds:");
		double sec = sc.nextDouble();
		System.out.println("Distance travelled in feet: "+(0.5*32.174*(sec*sec)));
	}
}
