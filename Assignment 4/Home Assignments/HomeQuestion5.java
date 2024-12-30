import java.util.Scanner;

public class HomeQuestion5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String val = "";
        for (int i = 1;i<=num ; i++ ){
            val =  val + i + val;
            System.out.println(val);
        }
    }
}
