public class HomeQuestion1 {
    public static void main(String[] args) {
        int squareOfSum = 0;
        int sumOfSquare = 0;
        for(int i = 1; i<=10 ; i++){
            sumOfSquare += (i*i);
            squareOfSum += i;
        }
        squareOfSum *= squareOfSum;
        System.out.println("The sum of the squares of the first 10 natural numbers is : "+sumOfSquare);
        System.out.println("The square of the sum of the first 10 natural numbers is : "+(squareOfSum));
        System.out.println("The difference of them is : "+ Math.abs(squareOfSum-sumOfSquare));
    }
}
