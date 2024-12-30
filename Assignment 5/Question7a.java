public class Question7a {
    public static void main(String[] args) {
        char num = 'A';
        for (int i = 1 ; i<=5;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(num+" ");
                num+=1;
            }
            num = 'A';
            System.out.println();
        }
    }
}
