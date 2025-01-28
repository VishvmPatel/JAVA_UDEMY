enum Dept {
    CS("John", "Block A"),
    IT("Smith", "Block B"),
    CIVIL("Srinivas", "Block C"),
    ECE("Dave", "Block D");

    private final String head;     // Head of the department
    private final String location; // Location of the department

    // Private constructor for enum constants
    private Dept(String head, String loc) {
        this.head = head;
        this.location = loc;
    }

    // Getter method to retrieve the head of the department
    public String getHeadName() {
        return head;
    }

    // Getter method to retrieve the location of the department
    public String getLocation() {
        return location;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        // Accessing a specific enum constant
        Dept d = Dept.CS;

        // Displaying details of the selected department
        System.out.println("Department: " + d);
        System.out.println("Head: " + d.getHeadName());
        System.out.println("Location: " + d.getLocation());

        // Iterating through all enum constants
        System.out.println("\nAll Departments:");
        for (Dept dept : Dept.values()) {
            System.out.println(dept + " - Head: " + dept.getHeadName() + ", Location: " + dept.getLocation());
        }
    }
}
