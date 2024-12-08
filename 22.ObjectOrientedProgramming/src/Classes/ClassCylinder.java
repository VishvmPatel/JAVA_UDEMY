package Classes;

import java.util.Scanner;

class Cylinder{
    public double radius;
    public double height;

    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+(circumference()*height);
    }
    public double volume(){
        return lidArea()*height;
    }
}
public class ClassCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder c1 = new Cylinder();
        System.out.println("Enter the radius and height of the Cylinder: ");
        c1.radius = sc.nextDouble();
        c1.height= sc.nextDouble();
        System.out.println("The LidArea of the Cylinder is: "+c1.lidArea());
        System.out.println("The Circumference of the Cylinder is: "+c1.circumference());
        System.out.println("The Total Surface Area of the Cylinder is: "+c1.totalSurfaceArea());
        System.out.println("The Volume of the Cylinder is: "+c1.volume());
    }
}
