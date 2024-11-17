public class lab2command1 {
	public static void main(String[] arg) {
		int a = Integer.parseInt(arg[0]);
		int  b = Integer.parseInt(arg[1]);
		System.out.println("Dividend: "+arg[0] + "\nDivisor: " +arg[1]+ "\nQuotient:"+ (a/b)   + "\nRemainder:"+(a%b));
	}
}
