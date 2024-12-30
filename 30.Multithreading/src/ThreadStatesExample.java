class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(2000); // Timed Waiting
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread is completed");
    }
}

public class ThreadStatesExample {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        System.out.println("State: " + t.getState()); // New
        t.start();
        System.out.println("State: " + t.getState()); // Runnable
        try {
            Thread.sleep(100); // Main thread waits
            System.out.println("State: " + t.getState()); // Timed Waiting or Runnable
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t.join(); // Main thread waits for t to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State: " + t.getState()); // Terminated
    }
}
