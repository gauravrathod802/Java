package Multithreading;
//9-12-23
public class JoinMethod extends Thread {
    public void run() {
        try {
        for (int i = 1; i < 5; i++) {
            System.out.println("run Thread");
            Thread.sleep(1000);
            Thread th=new Thread();
            th.join();
            }
            }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
        JoinMethod mj = new JoinMethod();
        mj.start();
//        mj.join();

        for (int i = 1; i < 5; i++) {
            System.out.println("Main Thread");
            mj.sleep(1000);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

