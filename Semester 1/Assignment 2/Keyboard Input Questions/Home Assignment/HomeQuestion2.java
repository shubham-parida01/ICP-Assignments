/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
import java.util.Scanner;

public class HomeQuestion2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Eggs:");
		int eggs = sc.nextInt();
		System.out.println(" You have "+(eggs/144)+" gross " + ((eggs/12)-((eggs/144)*12)) + "dozen, " + (eggs%12) + "extra");
	}
}
