package Synchronization;

class SharedData1 {
    private boolean flag = false;
    public synchronized void produce() {
        while (flag) {
            try {
                wait(); // Release the monitor and wait
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Produced data");
        flag = true;
        notify(); // Notify a waiting thread
    }
    public synchronized void consume() {
        while (!flag) {
            try {
                wait(); // Release the monitor and wait
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed data");
        flag = false;
        notify(); // Notify a waiting thread
    }
}
public class MonitorWithWaitNotify {
    public static void main(String[] args) {
        SharedData1 data = new SharedData1();
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                data.produce();
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                data.consume();
            }
        });
        producer.start();
        consumer.start();
    }
}

