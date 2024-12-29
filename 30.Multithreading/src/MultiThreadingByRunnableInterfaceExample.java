class My implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " hello");
            i++;
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                break; // Exit the loop if interrupted
            }
        }
    }
}

public class MultiThreadingByRunnableInterfaceExample {
    public static void main(String[] args) {
        My myTask = new My();
        Thread t = new Thread(myTask); // Create a Thread object with My as the task
        t.start(); // Start the custom thread

        int i = 1;
        while (true) {
            System.out.println(i + " world");
            i++;
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
                break; // Exit the loop if interrupted
            }
        }
    }
}
