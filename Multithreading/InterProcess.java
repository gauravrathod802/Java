package Multithreading;

public class InterProcess extends Thread{

        int sum=0;
        public void run(){
            synchronized (this){
                for (int i = 1; i < 5; i++) {
                    sum=sum+i;
                }
                this.notify();
            }
        }

    public static void main(String[] args) {
            try{
                InterProcess ip=new InterProcess();
                ip.start();
                synchronized (ip){
                    ip.wait();
                    System.out.println(ip.sum);
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
