/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
public class HomeQuestion3 {
    public static void main(String[] args){
        int val = Integer.parseInt(args[0]);
        if (val>= 1000 && val<=9999){
            int firstDigit = val/1000;
            int lastDigit = val%10;
            System.out.println("Sum of the First and Last Digits is : " + (firstDigit + lastDigit));
        } else {
            System.out.println("Enter a 4-Digit number");
        }
    }
}
