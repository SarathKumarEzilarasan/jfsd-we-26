package day_14.multithreading;

public class VolatileData {
    private volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
        ++counter;
    }
}

class VolatileDataTest {
    public static void main(String[] args) throws InterruptedException {
        VolatileData data = new VolatileData();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int oldValue = data.getCounter();
                System.out.println("Thread " + Thread.currentThread().getId() + " Old value = " + oldValue);
                data.increaseCounter();
                int newValue = data.getCounter();
                System.out.println("Thread " + Thread.currentThread().getId() + " New value = " + newValue);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int oldValue = data.getCounter();
                System.out.println("Thread " + Thread.currentThread().getId() + " Old value = " + oldValue);
                data.increaseCounter();
                int newValue = data.getCounter();
                System.out.println("Thread " + Thread.currentThread().getId() + " New value = " + newValue);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
