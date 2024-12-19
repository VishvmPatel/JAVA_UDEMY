class OuterClass {
    int x = 10; // Instance variable of Outer class
    static int y = 20; // Static variable of Outer class

    // Static nested class
    static class My {
        public void show() {
            // Static nested classes can only access static members of the outer class
            System.out.println("Static variable y: " + y);
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass.My m = new OuterClass.My();
        m.show();
    }
}

