package MethodOverriding;

class Car{
    public void start(){
        System.out.println("Car Started");
    }
    public void accelerate(){
        System.out.println("Car is Accelerated");
    }
    public void changeGear(){
        System.out.println("Car Gear Changed");
    }
}
class LuxaryCar extends Car{
    @Override
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void openRoof(){
        System.out.println("Sun Roof is Opened");
    }
}
public class OverridingExample3 {
    public static void main(String[] args) {
        Car c = new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        LuxaryCar c1 = new LuxaryCar(); //As openRoof method cannot be called with Car as the reference
        c1.openRoof(); //(DYNAMIC METHOD DISPATCH)

    }
}
