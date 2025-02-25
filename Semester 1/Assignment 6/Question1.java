import java.util.Scanner;

public class Question1{
    public static int additionSimple(int x , int y){
        return x+y;
    }
    public static int subtractionSimple(int x , int y){
        return y-x;
    }
    public static int multiplicationSimple(int x , int y){
        return x*y;
    }
    public static double divisionSimple(int x , int y){
        return (x!=0)?(y/x):0;
    }
    public static int remainderSimple(int x , int y){
        return y%x;
    }
    public static double squareRootSimple(int n){
        return Math.sqrt(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Square Root");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Number 1:");
                    int val1 = sc.nextInt();
                    System.out.print("Enter Number 2:");
                    int val2 = sc.nextInt();
                    int sum = additionSimple(val1, val2);
                    System.out.printf("Sum of the numbers is %s \n" , sum);
                    break;
                
                case 2:
                    System.out.print("Enter Number 1:");
                    int dif1 = sc.nextInt();
                    System.out.print("Enter Number 2:");
                    int dif2 = sc.nextInt();
                    int difference = subtractionSimple(dif1 , dif2);
                    System.out.printf("Difference of the numbers is %s \n" , difference);
                    break;
                
                case 3:
                    System.out.print("Enter Number 1:");
                    int prod1 = sc.nextInt();
                    System.out.print("Enter Number 2:");
                    int prod2 = sc.nextInt();
                    int product = multiplicationSimple(prod1, prod2);
                    System.out.printf("Product of the numbers is %s \n" , product);
                    break;

                case 4:
                    System.out.print("Enter Number 1:");
                    int div1 = sc.nextInt();
                    System.out.print("Enter Number 2:");
                    int div2 = sc.nextInt();
                    double quotient = divisionSimple(div1, div2);
                    System.out.printf("Quotient of the numbers is %s \n" , quotient);
                    break;
                
                case 5:
                    System.out.print("Enter Number 1:");
                    int rem1 = sc.nextInt();
                    System.out.print("Enter Number 2:");
                    int rem2 = sc.nextInt();
                    int remainder = remainderSimple(rem1, rem2);
                    System.out.printf("Remainder of the numbers is %s \n" , remainder);
                    break;

                case 6:
                    System.out.print("Enter Number:");
                    int square1 = sc.nextInt();
                    double squareRoot = squareRootSimple(square1);
                    System.out.printf("Square Root of the number is %s \n" , squareRoot);
                    break;
                default:
                    running = false;
                    System.out.println("Thanks for using !");
                    break;
            }
            System.out.println();

        }
    }
}