import java.util.Scanner;
public class Question6 {
    static int raisedToPower(int baseVal , int powerVal){
        if (powerVal == 1){
            return baseVal;
        } else {
                return baseVal * raisedToPower(baseVal, powerVal-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        int raised = raisedToPower(base, power);
        System.out.printf("%s to the power of %s is : %s",base , power , raised);
    }
}
