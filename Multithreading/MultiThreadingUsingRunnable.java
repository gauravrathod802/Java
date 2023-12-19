package Multithreading;

public class MultiThreadingUsingRunnable implements Runnable{
    public void run(){
        for (int i = 1; i < 4; i++) {
            System.out.println(i+" runnable thread");
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        MultiThreadingUsingRunnable mtr=new MultiThreadingUsingRunnable();
        System.out.println(mtr);
        Thread thread=new Thread(mtr);
        thread.start();
    }
}
