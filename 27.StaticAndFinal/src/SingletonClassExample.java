class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    // Static instance of CoffeeMachine
    private static CoffeeMachine instance = null;
    // Private constructor to prevent external instantiation
    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }
    // Public methods to modify ingredients
    public void fillWater(float qty) {
        waterQty += qty;
        System.out.println("Water refilled. Current water quantity: " + waterQty + "L");
    }
    public void fillSugar(float qty) {
        sugarQty += qty;
        System.out.println("Sugar refilled. Current sugar quantity: " + sugarQty + "kg");
    }
    public float getCoffee() {
        if (coffeeQty > 0.15f && waterQty > 0.15f && sugarQty > 0.05f) {
            coffeeQty -= 0.15f;
            waterQty -= 0.15f;
            sugarQty -= 0.05f;
            System.out.println("Coffee prepared!");
            return 0.15f;
        } else {
            System.out.println("Not enough ingredients to prepare coffee.");
            return 0f;
        }
    }
    // Static method to get the single instance of CoffeeMachine
    public static CoffeeMachine getInstance() {
        if (instance == null) {
            instance = new CoffeeMachine();
        }
        return instance;
    }
    // Method to display the current status of the machine
    public void displayStatus() {
        System.out.println("Coffee Qty: " + coffeeQty + "kg");
        System.out.println("Milk Qty: " + milkQty + "L");
        System.out.println("Water Qty: " + waterQty + "L");
        System.out.println("Sugar Qty: " + sugarQty + "kg");
    }
}
public class SingletonClassExample {
    public static void main(String[] args) {
        // Get the single instance of CoffeeMachine
        CoffeeMachine machine1 = CoffeeMachine.getInstance();
        CoffeeMachine machine2 = CoffeeMachine.getInstance();
        CoffeeMachine machine3 = CoffeeMachine.getInstance();
        // Check if all references point to the same instance
        System.out.println(machine1 + " " + machine2 + " " + machine3);
        if (machine1 == machine2 && machine1 == machine3) {
            System.out.println("All references point to the same CoffeeMachine instance.");
        }
        // Fill ingredients and prepare coffee
        machine1.fillWater(1.0f);
        machine1.fillSugar(0.5f);
        machine1.displayStatus();
        machine1.getCoffee();
        machine1.displayStatus();
    }
}
