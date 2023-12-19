package Multithreading;
// Here both the threads are executing concurrently i.e. run and main
//And everytime output will be different
public class SleepAndWait extends Thread{
    public void method1(){
        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("method1");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
    public void run(){
        method1();
        Thread th=new Thread();
        th.setPriority(MAX_PRIORITY);

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("run method");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        try {
            SleepAndWait sw= new SleepAndWait();
            sw.start();
            for (int i = 0; i < 5; i++) {
                System.out.println("Main method");
                sw.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
