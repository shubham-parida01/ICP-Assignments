import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int x1 = 0 ; 
        int x2 = 1;
        int temp ;
        if(n<=3){
            System.out.println("Error value of n less than equal to 3");
            System.exit(0);
        } else {
            System.out.print("The Squence is : " + x1 + " " + x2+" ");
            for (int i = 1; i<=n-2 ; i++){
                System.out.print(x1+x2 + " ");
                temp = x1;
                x1 = x2;
                x2 = temp + x1;
            }
        }
    }
}
