public class Question8 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1 ; i<=n ; i++){
            for(int j = 1; j<=i ; j++){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
