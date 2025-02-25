import java.util.Scanner;

public class HomeQuestion5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        if (num <= 0){
            System.out.println("Num should be more than 0");
        } else if (num  == 1){
            System.out.println("If n=1, it will display as: Fibonacci Series is:" +n1);
        } else if (num == 2){
            System.out.println("If n=2, it will display as: Fibonacci Series is:" +n1 + "," + n2);
        } else {
            System.out.printf("If n=%s, it will display as: Fibonacci Series is: %s , %s" , num , n1 , n2);
            for(int i = 1 ; i<num-1 ; i++){
                int next = n1 + n2;
                System.out.print(", " + next);
                n1 = n2;
                n2 = next;
            }
            System.out.println();
        }
}
}
