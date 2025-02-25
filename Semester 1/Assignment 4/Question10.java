import java.util.Scanner;


public class Question10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int val = sc.nextInt();
		int power = 0;
		int exp = 1;
		while (true){
			if (Math.pow(3,exp) > val){
				System.out.printf("the largest power of 3 less than or equal to %s is %s",val , power);
				break;
			} else {
				power = (int)Math.pow(3,exp);
				exp++;
			}
		}
	}
}
