class MyThread3 extends Thread {
    // Constructor to set the thread name
    public MyThread3(String name) {
        super(name);
    }

    // Overriding the run method to define thread behavior
    public void run() {
        int count = 1;
        while (!isInterrupted()) { // Check if the thread is interrupted
            System.out.println(Thread.currentThread().getName() + ": " + count++);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted!");
                break; // Exit the loop if interrupted
            }
        }
        System.out.println(Thread.currentThread().getName() + " has stopped.");
    }
}

public class ThreadMethods{
    public static void main(String[] args) {
        // Creating a new thread with a custom name
        MyThread3 t = new MyThread3("My Thread 1");
        t.setPriority(Thread.NORM_PRIORITY + 2); // Optional: Setting custom priority
        t.start(); // Start the thread

        try {
            Thread.sleep(5000); // Let the thread run for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupting the thread after 5 seconds
        System.out.println("Interrupting " + t.getName());
        t.interrupt();

        // Displaying thread details after interruption
        System.out.println("Thread ID: " + t.getId());
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Thread Priority: " + t.getPriority());
        System.out.println("Thread State: " + t.getState());
        System.out.println("Is Thread Alive: " + t.isAlive());
    }
}
