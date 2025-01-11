package Synchronization;

class MyData{
    public synchronized void display(String message){
        for(int i = 0; i < message.length(); i++){
            System.out.print(message.charAt(i));
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println();
    }
}
class MyThread extends Thread{
    MyData data;
    String message;
    MyThread(MyData data, String message){
        this.data = data;
        this.message = message;
    }
    @Override
    public void run(){
        data.display(message);
    }
}
public class SynchronizedMethodExample {
    public static void main(String[] args) {
        MyData data = new MyData();
        MyThread t1 = new MyThread(data, "Hello");
        MyThread t2 = new MyThread(data, "World");
        t1.start();
        t2.start();
    }
}
