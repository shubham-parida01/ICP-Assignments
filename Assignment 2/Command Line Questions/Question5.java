/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
public class Question5 {
    public static void main(String[] args) {
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        int val3 = Integer.parseInt(args[2]);
        int smallest = Math.min(val1 , Math.min(val2 , val3));
        int largest = Math.max(val1 , Math.max(val2 , val3));

        int middleValue = val1 + val2 + val3 - smallest - largest;
        System.out.println("Ascending order is : " + smallest + ", " + middleValue + ", " + largest);


    }
}
