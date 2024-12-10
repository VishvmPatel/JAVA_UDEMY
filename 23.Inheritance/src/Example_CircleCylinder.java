class Circle {
    private double radius;
    public Circle( ) {
        radius =0.0;
    }
    public double area() {
        return 0;
    }
    public double perimeter() {
        return 0;
    }
}
class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        height=0.0;
    }
    public double volume(){
        return 0;
    }
}
class Example_CircleCylinder
{
    public static void main(String[] args) {
        Circle c1=new Circle();
        Cylinder c2=new Cylinder();
    }
}