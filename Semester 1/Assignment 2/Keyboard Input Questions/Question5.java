/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
import java.util.Scanner;

public class Question5 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of Hemisphere:");
		double rad = sc.nextDouble();
		System.out.println("Surface area of hemisphere is "+(rad*3*Math.PI*rad));
		System.out.println("Volume of the hemisphere is "+(rad*rad*rad*(2.0/3)*Math.PI));
	}
}
