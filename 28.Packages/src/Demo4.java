package MyPackage2;

import MyPackage.Demo1;

// Class Demo4 extending Demo1 from a different package
public class Demo4 extends Demo1 {
    public void show() {
        // 'a' is package-private and not accessible from a different package
        // 'b' is public and accessible
        // 'c' is protected and accessible because Demo4 is a subclass of Demo1
        System.out.println("Sum in Demo4 (public + protected): " + (b + c));
    }
}
