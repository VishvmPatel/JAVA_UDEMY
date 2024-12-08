package Classes;

import java.util.Scanner;

class Rectangle{
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth){
            return true;
        }
        else{
            return false;
        }
    }
}
public class ClassRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("Enter Length and Breadth of the rectangle: ");
        r1.length = sc.nextDouble();
        r1.breadth = sc.nextDouble();
        System.out.println("The area of the Rectangle is: "+ r1.area());
        System.out.println("The perimeter of the Rectangle is: "+r1.perimeter());
        System.out.println("Is this Rectangle a square? "+r1.isSquare());
    }
}
