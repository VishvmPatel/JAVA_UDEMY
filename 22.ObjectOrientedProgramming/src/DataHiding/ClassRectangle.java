package DataHiding;

import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    // Getter for length
    public double getLength(){
        return length;
    }

    // Getter for breadth
    public double getBreadth(){
        return breadth;
    }

    // Setter for length
    public void setLength(double l){
        if (l >= 0)
            length = l;
        else
            length = 0;
    }

    // Setter for breadth
    public void setBreadth(double b){
        if (b >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    // Calculate area
    public double area(){
        return length * breadth;
    }

    // Calculate perimeter
    public double perimeter(){
        return 2 * (length + breadth);
    }

    // Check if rectangle is a square
    public boolean isSquare(){
        return length == breadth;
    }
}

public class ClassRectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();

        System.out.println("Enter the length of the Rectangle: ");
        double length = sc.nextDouble();
        r.setLength(length); // Pass user input to setLength

        System.out.println("Enter the breadth of the Rectangle: ");
        double breadth = sc.nextDouble();
        r.setBreadth(breadth); // Pass user input to setBreadth

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Is Square: " + r.isSquare());

        System.out.println("Length: " + r.getLength());
        System.out.println("Breadth: " + r.getBreadth());

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
