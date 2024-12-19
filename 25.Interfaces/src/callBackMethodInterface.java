interface Member {
    void callback(); // Abstract method
}
class Store {
    Member[] members = new Member[10]; // Array to store members
    int count = 0;
    // Register a new member
    void register(Member m) {
        if (count < members.length) {
            members[count++] = m;
            System.out.println("Member registered successfully.");
        } else {
            System.out.println("Registration full. Cannot add more members.");
        }
    }
    // Notify all members about the sale
    void inviteSale() {
        System.out.println("Inviting all registered members for the sale:");
        for (int i = 0; i < count; i++) {
            members[i].callback();
        }
    }
}
class Customer implements Member {
    String name;
    Customer(String n) {
        name = n;
    }
    // Implementation of the callback method
    public void callback() {
        System.out.println("Ok, I will visit, " + name);
    }
}
public class callBackMethodInterface {
    public static void main(String[] args) {
        // Create a Store
        Store s = new Store();
        // Create Customers
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");
        Customer c3 = new Customer("Emily");
        // Register Customers with the Store
        s.register(c1);
        s.register(c2);
        s.register(c3);
        // Notify all registered customers about the sale
        s.inviteSale();
        // Adding more customers to demonstrate array limit handling
        Customer c4 = new Customer("Alice");
        Customer c5 = new Customer("Bob");
        s.register(c4);
        s.register(c5);
        // Inviting after adding more members
        s.inviteSale();
    }
}
