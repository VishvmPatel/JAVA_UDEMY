package MethodOverriding;

class SuperClass {
    public void meth1() {
        System.out.println("Super Meth1");
    }
    public void meth2() {
        System.out.println("Super Meth2");
    }
}
class SubClass extends SuperClass {
    @Override
    public void meth2() {
        System.err.println("Sub Meth2");
    }
    public void meth3() {
        System.out.println("Sub Meth3");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        SuperClass sup=new SubClass();
        sup.meth1();
        sup.meth2();
        SubClass sub = new SubClass();
        sub.meth3();
    }
}