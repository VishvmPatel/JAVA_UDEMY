class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();

        t1.setPriority(Thread.MIN_PRIORITY); // Set priority to 1
        t2.setPriority(Thread.NORM_PRIORITY); // Set priority to 5
        t3.setPriority(Thread.MAX_PRIORITY); // Set priority to 10

        t1.start();
        t2.start();
        t3.start();
    }
}
