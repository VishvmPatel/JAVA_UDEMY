abstract class Shape {
    // Abstract methods for perimeter and area
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape {
    private double radius;
    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double breadth;
    // Constructor for Rectangle
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
    @Override
    public double area() {
        return length * breadth;
    }
}
public class ShapeExample {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape circle = new Circle(7); // Circle with radius 7
        Shape rectangle = new Rectangle(10, 5); // Rectangle with length 10 and breadth 5
        // Demonstrate polymorphism
        System.out.println("Circle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}
