package Synchronization;

class MyData1{
    public void display(String message){
        synchronized ( this ){
            for(int i = 0; i < message.length(); i++){
                System.out.print(message.charAt(i));
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
            System.out.println();
        }
    }
}
class MyThread1 extends Thread{
    MyData1 data1;
    String message;
    MyThread1(MyData1 data1, String message){
        this.data1 = data1;
        this.message = message;
    }
    @Override
    public void run(){
        data1.display(message);
    }
}
public class SynchronizedBlockExample {
    public static void main(String[] args) {
        MyData1 data1 = new MyData1();
        MyThread1 t1 = new MyThread1(data1, "Java");
        MyThread1 t2 = new MyThread1(data1, "Synchronization");
        t1.start();
        t2.start();
    }
}
