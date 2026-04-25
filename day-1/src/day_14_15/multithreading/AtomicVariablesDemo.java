package day_14_15.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariablesDemo {
    private static AtomicInteger counter = new AtomicInteger(0);
    private static int counterSync = 0;

    public static void incrementSync() {
        for (int i = 0; i < 10000; i++) {
            counterSync++;
        }
    }

    public static void increment(){
        for (int i = 0; i < 10000; i++) {
            counter.getAndIncrement();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                incrementSync();
                increment();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                incrementSync();
                increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

//        System.out.println("Counter: " + counterSync);
        System.out.println("Counter: " + counter);
    }
}
