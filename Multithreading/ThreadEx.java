package Multithreading;

public class ThreadEx extends Thread{
    public void method1(){
        System.out.println("local method");
    }
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println(i+" thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        method1();                            //this method will act as thread now
    }
    public static void main(String[] args) {
        ThreadEx tc=new ThreadEx();
        tc.start();
    }
}
