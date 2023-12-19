package Multithreading;

public class YieldMethod extends Thread{
    public void run(){
//        Thread.yield();
        for (int i = 1; i < 5; i++) {
            System.out.println("child thread"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        YieldMethod ym=new YieldMethod();
        ym.start();
        Thread.yield();
        for (int i = 1; i < 5; i++) {
            System.out.println("main thread"+i);
        }
    }
}
