package MyPackage;
// Class Demo3 extending Demo1
public class Demo3 extends Demo1 {
    public void show() {
        // 'a' is package-private and not directly accessible here since it's in another file
        // 'b' and 'c' are accessible because 'b' is public and 'c' is protected
        System.out.println("Sum in Demo3 (b + c): " + (b + c));
    }
}

