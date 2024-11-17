public class Question3 {
    public static void main(String[] args){
        int min = 1;
        int max = 6;
        int randomNumber1 = (int) (Math.random() * (max - min + 1)) + min;
        int randomNumber2 = (int) (Math.random() * (max - min + 1)) + min;

        System.out.println("Random Number 1: " + randomNumber1);
        System.out.println("Random Number 2: " + randomNumber2);
        System.out.println("Sum of Both is : " + (randomNumber1 + randomNumber2));
    }
}
