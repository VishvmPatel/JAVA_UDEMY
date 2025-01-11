package Synchronization;

class SharedResource {
    public void display(String message) {
        synchronized (this) { // Monitor is associated with 'this' object
            for (int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i));
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println();
        }
    }
}
class MyThread2 extends Thread {
    SharedResource resource;
    String message;
    MyThread2(SharedResource resource, String message) {
        this.resource = resource;
        this.message = message;
    }
    @Override
    public void run() {
        resource.display(message); // Access shared resource
    }
}
public class MonitorExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        MyThread2 t1 = new MyThread2(resource, "Hello");
        MyThread2 t2 = new MyThread2(resource, "World");
        t1.start();
        t2.start();
    }
}

