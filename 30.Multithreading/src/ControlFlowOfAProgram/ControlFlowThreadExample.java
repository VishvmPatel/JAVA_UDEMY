package ControlFlowOfAProgram;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Running: "+Thread.currentThread().getName());
    }
}
public class ControlFlowThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Main Thread: "+Thread.currentThread().getName());
    }
}