public class HomeQuestion1 {
    public static void main(String[] args) {
        int n = 1;
        for(int i = 1; i<=5; i++){
            for(int j = 5 ; j>= 1; j--){
                if(j == n){
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
            n++;
        }
    }
}
