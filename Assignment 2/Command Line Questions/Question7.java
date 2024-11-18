/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
public class Question7 {
    public static void main(String[] args) {
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        int val3 = Integer.parseInt(args[2]);

        if (val1<0 || val2<0  || val3<0){
            System.out.println("Error , Positive Integers needed");
        } else {
            if (val1 <= (val2 * val3)){
                System.out.println(true);
            } else if (val2 <= (val1 * val3)){
                System.out.println(true);
            } else if (val3 <= ( val1*val2)){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
    }
}
}
