// Abstract class
abstract class KFC {
    // Constructor
    KFC() {
        System.out.println("KFC franchise initialized.");
    }
    // Non-abstract method
    void makeItem() {
        System.out.println("Items are being prepared in the kitchen.");
    }
    // Abstract methods
    abstract void billing();
    abstract void offer();
}
// Concrete subclass
class MyKFC extends KFC {
    // Constructor
    MyKFC() {
        System.out.println("Welcome to MyKFC!");
    }
    // Implementing the billing method
    @Override
    void billing() {
        System.out.println("Billing is processed at the counter.");
    }
    // Implementing the offer method
    @Override
    void offer() {
        System.out.println("Today's offer: Buy 1 Get 1 Free on all burgers!");
    }
}
// Main class
public class KFCExample {
    public static void main(String[] args) {
        // Creating an instance of the concrete subclass
        MyKFC myKFC = new MyKFC();
        // Invoking methods
        myKFC.makeItem();
        myKFC.billing();
        myKFC.offer();
    }
}
