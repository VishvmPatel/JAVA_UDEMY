class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (!Thread.currentThread().isInterrupted()) { // Check if the thread is interrupted
            System.out.println(i + " Hello");
            i++;
            try {
                Thread.sleep(500); // Sleep for 500ms to simulate work
            } catch (InterruptedException e) {
                System.out.println("MyRunnable thread interrupted!");
                break; // Exit the loop if the thread is interrupted
            }
        }
        System.out.println("MyRunnable thread has stopped.");
    }
}

public class ThreadMethods2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable(); // Runnable implementation
        Thread th = new Thread(myRunnable, "MyRunnableThread"); // Creating thread with name
        th.start(); // Start the thread

        int i = 1;
        while (i <= 5) { // Main thread runs for a limited time
            System.out.println(i + " World");
            i++;
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted!");
            }
        }

        // Interrupt the child thread after main thread finishes its loop
        System.out.println("Main thread is interrupting the child thread...");
        th.interrupt();

        try {
            th.join(); // Wait for the child thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for child thread!");
        }

        System.out.println("Main thread has finished.");
    }
}
