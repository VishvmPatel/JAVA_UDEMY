package MethodOverloading;
class Example {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        return c;
    }
}
public class MOExample {
    public static void main(String[] args) {
        // Correctly calling the static method
        System.out.println(Example.max(10, 5));
        // Creating an instance to call the non-static method
        Example exampleInstance = new Example();
        System.out.println(exampleInstance.max(10, 15, 5));
    }
}

