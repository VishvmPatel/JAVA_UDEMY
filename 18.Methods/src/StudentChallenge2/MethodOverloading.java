package StudentChallenge2;

public class MethodOverloading {
    static double area(double radius) {
        return Math.PI*radius*radius;
    }
    static double area(double length,double breadth) {
        return length*breadth;
    }

    public static void main(String[] args) {
        System.out.println("Area of the Circle is: "+area(7));
        System.out.println("Area of the Rectangle is: "+area(7,8));
    }
}
