import java.util.Scanner;

class Complex{
    int real;
    int imag;
    void setData(int real , int imag){
        this.real = real;
        this.imag = imag;
    }
    void display(){
        System.out.printf("%d + %di%n" , real , imag);
    }

    public Complex add(Complex num1 , Complex num2){
        Complex num3 = new Complex();
        num3.real = num1.real + num2.real;
        num3.imag = num1.imag + num2.imag;
        return num3;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Complex comp1 = new Complex();
        Complex comp2 = new Complex();

        comp1.setData(3, 4);
        comp2.setData(5, 6);

        System.out.println("Complex Number 1:");
        comp1.display();
        System.out.println("Complex Number 2:");
        comp2.display();

        Complex result = new Complex();
        result = result.add(comp2, comp1);

        System.out.println("Resulting Complex Number: ");
        result.display();
    }
}
