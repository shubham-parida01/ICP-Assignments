/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
public class HomeQuestion1 {
    public static void main(String[] args) {
        double principle = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);
        System.out.println("Simple Interest is: " + (principle * rate * time)/100);  
    }
}
