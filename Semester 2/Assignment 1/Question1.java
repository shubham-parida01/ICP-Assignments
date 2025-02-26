public class Question1{
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("Enter a positive integer greater than 2");
            System.exit(0);
        }
        int num = Integer.parseInt(args[0]);
        System.out.println("The positive integer greater than 2 from command line argument is " + num);
        int count =  0;
        while(num > 2){
            num /= 2;
            count++;
        }
        System.out.println(count);
    }
}
