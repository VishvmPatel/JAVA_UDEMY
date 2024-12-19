interface Test {
    void meth1(); // Abstract method
    void meth2(); // Abstract method
}
// Class that implements the interface
class Test2 implements Test {
    // Provide implementation for meth1()
    public void meth1() {
        System.out.println("Implementation of meth1()");
    }
    // Provide implementation for meth2()
    public void meth2() {
        System.out.println("Implementation of meth2()");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        // Using the interface reference to refer to the implementing class object
        Test t = new Test2();
        // Calling the methods
        t.meth1();
        t.meth2();
    }
}
