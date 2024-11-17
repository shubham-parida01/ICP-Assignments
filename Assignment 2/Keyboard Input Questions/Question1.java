import java.util.Scanner;


public class Question1{
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Fahrenheit:");
		double Fahren = sc.nextDouble();
		double Celsius = (Fahren-32)*(5.0/9);
		System.out.println("Celsius is:"+Celsius);
	}
}
