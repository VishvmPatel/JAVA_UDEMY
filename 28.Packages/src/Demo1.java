package MyPackage;
public class Demo1 {
    int a = 10; // Default access modifier (package-private)
    public int b = 20; // Public access
    protected int c = 30; // Protected access
    private int d = 40; // Private access

    public void display() {
        // d is accessible here because it is private to the same class
        System.out.println("Sum in Demo1 (default + public + protected + private): " + (a + b + c + d));
    }
}
