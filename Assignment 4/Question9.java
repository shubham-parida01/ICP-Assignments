import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int val =  sc.nextInt();
        int num = val;
        int nonZero = 0;
        while (val>0){
            if(val%10 != 0){
                nonZero *= 10;
                nonZero += (val%10);
                val /= 10;
            } else {
                val /= 10;
            }
        }
        while (nonZero>0){
            val *= 10;
            val += (nonZero%10);
            nonZero /= 10;
        }
        System.out.printf("After removing the 0 from the number %s , the new number is %s",num , val );
    }
}
