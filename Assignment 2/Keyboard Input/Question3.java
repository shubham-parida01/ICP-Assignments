import java.util.Scanner;

public class lab2Q3 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic in-hand Salary:");
		int sal = sc.nextInt();
		System.out.println("DA is "+sal*0.4);
		System.out.println("HRA is "+sal*0.2);
		System.out.println("Gross salary is "+(int)(sal*0.4 + sal*0.2 + sal));
	}
}
