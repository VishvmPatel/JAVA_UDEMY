class MyThread extends Thread {
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
            }
        }
    }
}

public class MultiThreadingByThreadClassExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // Start the custom thread

        int i = 1;
        while (true) {
            System.out.println(i + " world");
            i++;
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
    }
}
