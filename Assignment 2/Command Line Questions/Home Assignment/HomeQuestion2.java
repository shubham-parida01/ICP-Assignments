/* Author's Name = 
 * Authors's Registration Number = 
 * Author's Semester = 
 * Author's Branch-Section = 
 * Subject
 * Problem Description =
*/
public class HomeQuestion2 {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double area = (Math.PI * radius * radius) + (2*Math.PI * radius * height);
        System.out.println("Surface Area of Cylinder is : " + area);
    }
}
