package Synchronization;

class SharedData {
    private boolean flag = false;
    public synchronized void produce() {
        while (flag) {
            try {
                wait(); // Wait for consumer
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Produced data");
        flag = true;
        notify(); // Notify consumer
    }
    public synchronized void consume() {
        while (!flag) {
            try {
                wait(); // Wait for producer
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed data");
        flag = false;
        notify(); // Notify producer
    }
}
public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedData data = new SharedData();
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

