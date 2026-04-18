package day_13.multithreading;

public class Demo {


    public static void deadlock() throws InterruptedException {
        MyThread1 myRunnable = new MyThread1();
        Thread thread = new Thread(myRunnable);
        MyThread1.mainThread = Thread.currentThread();
//        thread.setPriority(10);
        thread.start();
        thread.join(); // deadlock


        for (int i = 0; i < 3; i++) {
            System.out.println("from main thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void threadCreation() throws InterruptedException {
//        MyThread thread = new MyThread();
//        thread.start();


        MyThread1 myRunnable = new MyThread1();
        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("from main thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
