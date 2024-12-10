class Account {
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance; // Protected to allow subclass access
    // Constructor to initialize account
    public Account(String acc, String n, String add, String phno, String dob) {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;  // Default balance
    }
    // Getter methods
    public String getAccNo() { return accNo; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhno() { return phno; }
    public String getDOB() { return dob; }
    public long getBalance() { return balance; }
    // Setter methods
    public void setAddress(String add) { address = add; }
    public void setPhno(String phno) { this.phno = phno; }
}
class SavingsAccount extends Account {
    // Constructor to initialize SavingsAccount
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob); // Call the superclass constructor
    }
    // Method to deposit money
    public void deposit(long amt) {
        if (amt > 0) {
            balance += amt;
        }
    }
    // Method to withdraw money
    public void withdraw(long amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        }
    }
}
class LoanAccount extends Account {
    // Constructor to initialize LoanAccount
    public LoanAccount(String acc, String n, String add, String phno, String dob, long initialLoan) {
        super(acc, n, add, phno, dob); // Call the superclass constructor
        this.balance = initialLoan; // Set initial loan balance
    }
    // Method to pay EMI
    public void payEMI(long amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
        }
    }
    // Method to repay loan
    public void repay(long amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            if (balance == 0) {
                System.out.println("Loan fully repaid.");
            }
        }
    }
}
public class BankExample {
    public static void main(String[] args) {
        // Create a SavingsAccount instance
        SavingsAccount savingsAcc = new SavingsAccount("12345", "John", "123 Street", "1234567890", "01/01/1990");
        savingsAcc.deposit(1000);
        System.out.println("Savings Account Balance: " + savingsAcc.getBalance());
        // Create a LoanAccount instance with initial loan balance
        LoanAccount loanAcc = new LoanAccount("54321", "Alice", "456 Avenue", "0987654321", "02/02/1992", 5000);
        loanAcc.payEMI(1000);
        System.out.println("Loan Account Balance after EMI: " + loanAcc.getBalance());
        loanAcc.repay(4000);
        System.out.println("Loan Account Balance after full repayment: " + loanAcc.getBalance());
    }
}
