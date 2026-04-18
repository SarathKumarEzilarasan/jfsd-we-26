package day_14.multithreading;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsDemo {
//    static Map<Integer, String> map = new HashMap<>();
    static Map<Integer, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    map.put(i, Thread.currentThread().getName());
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    map.put(i * 10000, Thread.currentThread().getName());
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Size: " + map.size());

        StringBuilder sb = new StringBuilder();
        sb.append(10);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(10);
    }
}
