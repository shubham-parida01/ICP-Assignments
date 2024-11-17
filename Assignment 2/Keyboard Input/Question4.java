import java.util.Scanner;

public class LAB2q4 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number between 0 and 1000:");
		int val = sc.nextInt();
		int sum = 0;
		if (val<=1000) {
			while(val > 0) {
				sum += val%10;
				val /= 10;
			}
			System.out.println("The sum of digits is "+sum);
		} else {
			System.out.println("Number out of range");
		}
	}
}
