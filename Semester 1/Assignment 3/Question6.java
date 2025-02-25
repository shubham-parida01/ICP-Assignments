import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Units: ");
        int units = sc.nextInt();
        double cost ;
        if (units<=50){
            cost = units*3;
        } else if (units <= 200){
            cost = ((50*3) + (units-50)*4.8);
        } else if (units <= 400){
            cost = ((50*3) + (150*4.8) + ((units-200)*5.8));
        } else {
            cost = ((50*3) + (150*4.8) + (200*5.8) + ((units-400)*6.2));
        }
        System.out.println("Total electric bill is : " + cost);
    }
}
