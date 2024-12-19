interface MyInterface {
    void display();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous inner class implementing an interface
        MyInterface obj = new MyInterface() {
            @Override
            public void display() {
                System.out.println("Anonymous Inner Class: Display Method");
            }
        };
        obj.display();
        // Anonymous inner class as an argument
        executeTask(new MyInterface() {
            @Override
            public void display() {
                System.out.println("Anonymous Inner Class passed as an argument");
            }
        });
    }
    static void executeTask(MyInterface task) {
        task.display();
    }
}
