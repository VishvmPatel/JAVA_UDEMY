import MyPackage2.Demo4;
import MyPackage.Demo1;
import MyPackage.Demo3;
public class AccessModifierExample {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.display(); // Accessing public method from Demo1
        // Accessing fields of Demo1:
        // 'a' is package-private and not accessible here
        // 'b' is public and accessible
        // 'c' is protected and not accessible here since it's not a subclass
        // 'd' is private and not accessible
        System.out.println("Accessing from MyPack1 (public): " + d1.b);
        // Accessing Demo3
        Demo3 d3 = new Demo3();
        d3.show();
        // Accessing Demo4
        Demo4 d4 = new Demo4();
        d4.show();
    }
}
