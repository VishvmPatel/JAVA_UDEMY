class MyClass {
    private int id;
    public MyClass(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "MyClass ID: " + id;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyClass myClass = (MyClass) obj;
        return id == myClass.id;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
public class ObjectClassExample {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1);
        MyClass obj2 = new MyClass(1);

        System.out.println(obj1.toString()); // MyClass ID: 1
        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1.hashCode()); // Some hash code
    }
}
