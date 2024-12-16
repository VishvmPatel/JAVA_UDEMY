// Abstract class
abstract class Super {
    // Constructor
    Super() {
        System.out.println("Super");
    }
    // Non-abstract method
    void meth1() {
        System.out.println("Meth1");
    }
    // Abstract method
    abstract void meth2();
}
// Concrete class
class Sub extends Super {
    @Override
    // Implementation of the abstract method
    void meth2() {
        System.out.println("Meth2");
    }
}
class Example {
    public static void main(String[] args) {
        // Reference of abstract class is allowed
        Super s1;
        // Creating an object of the concrete class
        Sub s2 = new Sub();
        // Calling methods
        s2.meth1();
        s2.meth2();
    }
}
