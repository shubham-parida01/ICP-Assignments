import java.util.Scanner;

public class HomeQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 1;
        while (num>0){
            if(num %2 == 0){
                even += num;
            } else {
                odd *= num;
            }
            num--;
        }
        System.out.println("Sum of all even numbers is : "+ even);
        System.out.println("Product of all odd number is : "+ odd);
    }
}
