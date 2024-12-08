package Classes;

import java.util.Scanner;

class Circle{
    public double radius;

    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
}
public class ClassCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.println("Enter the radius of the Circle: ");
        c1.radius = sc.nextDouble();
        System.out.println("The area of the Circle is: "+ c1.area());
        System.out.println("The circumference of the Circle is: "+ c1.circumference());
    }
}
