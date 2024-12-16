// Abstract class
abstract class Hospital {
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}
// Concrete subclass
class MyHospital extends Hospital {
    // Constructor
    MyHospital() {
        System.out.println("Welcome to MyHospital!");
    }
    // Overriding the emergency method
    @Override
    void emergency() {
        System.out.println("Emergency services are available 24/7.");
    }
    // Overriding the appointment method
    @Override
    void appointment() {
        System.out.println("Appointments can be booked online or via phone.");
    }
    // Overriding the admit method
    @Override
    void admit() {
        System.out.println("Patient admission process is smooth and quick.");
    }
    // Overriding the billing method
    @Override
    void billing() {
        System.out.println("Billing department is located on the ground floor.");
    }
}
// Main class
public class HospitalExample {
    public static void main(String[] args) {
        // Creating an instance of the concrete subclass
        MyHospital myHospital = new MyHospital();
        // Invoking the methods
        myHospital.emergency();
        myHospital.appointment();
        myHospital.admit();
        myHospital.billing();
    }
}
