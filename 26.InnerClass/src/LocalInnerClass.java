class OuterWithLocal {
    int x = 10;
    void display() {
        // Local inner class defined inside a method
        class Local {
            void show() {
                System.out.println("Instance variable x: " + x);
            }
        }
        // Create an instance of the local inner class and call its method
        Local local = new Local();
        local.show();
    }
}
public class LocalInnerClass {
    public static void main(String[] args) {
        OuterWithLocal outer = new OuterWithLocal();
        outer.display();
    }
}
