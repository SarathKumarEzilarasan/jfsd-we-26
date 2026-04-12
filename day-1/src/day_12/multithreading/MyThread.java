package day_12.multithreading;

public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("from child thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread1 implements Runnable {

    static Thread mainThread;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
//            Thread.yield();
            try {
//                mainThread.join();
                System.out.println("from child thread");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}