class Outer {
    int x = 10; // Instance variable of Outer class

    // Inner class
    class Inner {
        int y = 20; // Instance variable of Inner class

        void innerDisplay() {
            System.out.println("Outer class variable x: " + x);
            System.out.println("Inner class variable y: " + y);
        }
    }

    void outerDisplay() {
        // Create an instance of Inner class and call its method
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println("Accessing Inner class variable y from Outer class: " + i.y);
    }
}

public class NestedInnerClass{
    public static void main(String[] args) {
        // Create an instance of Outer class
        Outer o = new Outer();
        o.outerDisplay();

        // Create an instance of Inner class using Outer class
        Outer.Inner i = o.new Inner();
        i.innerDisplay();

        // Additional demonstration
        System.out.println("Directly accessing Inner class method through separate instance:");
        Outer.Inner anotherInner = new Outer().new Inner();
        anotherInner.innerDisplay();
    }
}
