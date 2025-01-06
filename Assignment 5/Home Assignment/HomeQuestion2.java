public class HomeQuestion2 {
    public static void main(String[] args) {
        int rows = 4;
        int adder = 0;
        for ( int i = 1; i <= rows ; i++){
            for ( int j = 0; j <rows -i;j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i + adder ; k++){
                System.out.print("*");
            }
            adder++;
            System.out.println();
        }
    }
}
