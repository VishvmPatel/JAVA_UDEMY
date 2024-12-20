class Parent {
    // Final method
    final void displayMessage() {
        System.out.println("This is a final method in the Parent class.");
    }
    void show() {
        System.out.println("This is a non-final method in the Parent class.");
    }
}
class Child extends Parent {
    // This method is allowed to be overridden
    @Override
    void show() {
        System.out.println("This is an overridden method in the Child class.");
    }
    // Uncommenting the below code will cause a compilation error
    // @Override
    // void displayMessage() {
    //     System.out.println("Trying to override a final method.");
    // }
}
public class FinalMethodExample {
    public static void main(String[] args) {
        Child child = new Child();
        // Calling methods from the Child class
        child.displayMessage(); // Calls the final method from Parent class
        child.show();           // Calls the overridden method from Child class
    }
}