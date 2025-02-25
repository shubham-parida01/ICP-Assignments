/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
import java.util.Scanner;

public class Question2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your distance in km:");
		int km = sc.nextInt();
		System.out.println(km+" km is "+km*1000+" meters");
		System.out.println(km+" km is "+km*3280.8399+" feet");
		System.out.println(km+" km is "+km*39370.0787+ " inch");
		System.out.println(km+" km is "+km*100000+" centimetre");
	}
}
