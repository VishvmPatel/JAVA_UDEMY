import java.time.Year;
class Student {
    private String rollNo;
    // Static count variable to track the roll number sequence
    private static int count = 1;
    // Private method to assign roll number
    private String assignRollNo() {
        int year = Year.now().getValue(); // Get the current year
        String rno = "Univ-" + year + "-" + count;
        count++;
        return rno;
    }
    // Constructor to initialize roll number
    public Student() {
        rollNo = assignRollNo();
    }
    // Getter for roll number
    public String getRollNo() {
        return rollNo;
    }
}
public class StaticRollNumberExample{
    public static void main(String[] args) {
        // Create multiple Student instances
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        // Print roll numbers
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
        // Add additional students and print their roll numbers
        Student s4 = new Student();
        Student s5 = new Student();
        System.out.println(s4.getRollNo());
        System.out.println(s5.getRollNo());
    }
}
