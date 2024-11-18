/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
public class Question2 {
    public static void main(String[] args) {
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        if (val1<0 || val2<0){
            System.out.println("Error , Positive Integers needed");
        } else {
            double num1 = (double)val1;
            double num2 = (double)val2;
            
            System.out.println(Math.pow(num1 , num2));
        }
        
    }
}
