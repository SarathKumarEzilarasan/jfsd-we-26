package day_13.multithreading;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Processor processor = new Processor();
        AppThreadProducer producer = new AppThreadProducer(processor);
        AppThreadConsumer consumer = new AppThreadConsumer(processor);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}


class Processor {

    private List<Integer> list = new ArrayList<>();
    private int LIMIT = 5;
    private int BOTTOM = 0;
    private int value = 0;

    private Object obj = new Object();


    public void producer() throws InterruptedException {
        synchronized (obj) {
            while (true) {
                if (list.size() == LIMIT) {
                    System.out.println("Waiting for removing items from the list....");
                    obj.wait();
                } else {
                    System.out.println("Adding: " + value);
                    list.add(value);
                    value++;
                    obj.notify();
                }
                Thread.sleep(500);
            }
        }
    }

    public void consumer() throws InterruptedException {
        synchronized (obj) {
            while (true) {
                if (list.size() == BOTTOM) {
                    System.out.println("Waiting for adding items from the list....");
                    obj.wait();
                } else {
                    System.out.println("Removing: " + list.remove(--value));
                    obj.notify();
                }
                Thread.sleep(500);
            }
        }
    }
}

class AppThreadProducer implements Runnable {

    Processor processor;

    public AppThreadProducer(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        try {
            processor.producer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class AppThreadConsumer implements Runnable {

    Processor processor;

    public AppThreadConsumer(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        try {
            processor.consumer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

