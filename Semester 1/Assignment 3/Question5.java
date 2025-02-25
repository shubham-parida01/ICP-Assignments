import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Input your year: ");
        int year = sc.nextInt();
        if (year%400 == 0 || year%100 !=0 && year%4 == 0){
            System.out.println(year +" is a leap year : true");
        } else {
            System.out.println(year +" is a leap year : false");
        }
    }
}
