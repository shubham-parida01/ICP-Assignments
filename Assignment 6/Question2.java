public class Question2 {
    public static int getPentagonalNumber(int n){
        return (n*(3*n - 1))/2;
    }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <=100 ;i++){
            System.out.print(getPentagonalNumber(i) + " ");
            count++;
            if(count == 10){
                System.out.print("\n");
                count = 0;
            }

        }
    }
}
