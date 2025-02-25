public class Question10 {
    public static double area(int base , int height){
        return 0.5*base*height;
    }
    public static double area(int side){
        return side*side;
    }
    public static double area(double radius){
        return Math.PI*radius*radius;
    }
    public static double area(double breadth , double height){
        return breadth*height;
    }
    public static void main(String[] args) {
        System.out.println("Area of triangle: " + area(10, 5));
        System.out.println("Area of square: " + area(4));
        System.out.println("Area of circle: " + area(7.5));
        System.out.println("Area of rectangle: " + area(8, 6));
    }


}
