package day_14_15.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DaemonThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread t1 = new Thread(thread);
        t1.setDaemon(true);
        t1.start();
        System.out.println("from main thread");
    }
}

class MyThread implements Runnable {
    Lock lock = new ReentrantLock();


    @Override
    public void run() {
//        synchronized (this) {
        lock.lock();
        for (int i = 0; i < 3; i++) {
            System.out.println("from child thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lock.unlock();
//        }
    }
}
