class My {
    // Final variables
    final int MIN = 1;    // Direct initialization
    final int NORMAL;     // Will be initialized in a static block
    final int MAX;        // Will be initialized in the constructor
    // Static block to initialize the NORMAL variable
    {
        NORMAL = 5;
    }
    // Constructor to initialize the MAX variable
    My() {
        MAX = 10;
    }
    void displayValues() {
        System.out.println("MIN: " + MIN);
        System.out.println("NORMAL: " + NORMAL);
        System.out.println("MAX: " + MAX);
    }
}
public class FinalVariableExample {
    public static void main(String[] args) {
        My obj = new My();
        obj.displayValues();
    }
}
