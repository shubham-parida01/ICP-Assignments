import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to cast your vote");
        } else {
            System.out.println("You are NOT eligible to cast your vote");
        }
    }
}
