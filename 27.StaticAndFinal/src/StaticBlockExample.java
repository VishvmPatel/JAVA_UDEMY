public class StaticBlockExample {
    static int a;
    static int b;

    // Static block to initialize static variables
    static {
        System.out.println("Static block is executed.");
        a = 10;
        b = 20;
    }

    // Static method to display values
    static void display() {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    public static void main(String[] args) {
        System.out.println("Main method starts.");

        // Accessing static variables and method
        System.out.println("Accessing static variables and method:");
        display();

        System.out.println("Main method ends.");
    }
}
