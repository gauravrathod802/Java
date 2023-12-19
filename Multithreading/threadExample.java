package Multithreading;

class threadExample extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            threadExample th = new threadExample();
            th.start();
        }
    }
}