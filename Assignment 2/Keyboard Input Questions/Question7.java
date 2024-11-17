import java.util.Scanner;
import java.math.*;

public class Question7 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 2;
		System.out.println("a    b    pow(a,b)");
		System.out.println(a + "   " + b + "   " + (int)Math.pow((double)a, (double)b));
		a++;
		b++;
		System.out.println(a + "   " + b + "   " + (int)Math.pow((double)a, (double)b));
		a++;
		b++;
		System.out.println(a + "   " + b + "   " + (int)Math.pow((double)a, (double)b));
		a++;
		b++;
		System.out.println(a + "   " + b + "   " + (int)Math.pow((double)a, (double)b));
		a++;
		b++;
		System.out.println(a + "   " + b + "   " + (int)Math.pow((double)a, (double)b));
		
	}
}
