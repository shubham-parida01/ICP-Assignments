/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
import java.util.Scanner;

public class HomeQuestion1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes:");
		int min = sc.nextInt();
		int days = (min/(60*24));
		int years = min/(365*24*60);
		System.out.println(min+" minutes is approx "+years +" years and "+(days-(years*365)) +"Days");
		
	}
}
