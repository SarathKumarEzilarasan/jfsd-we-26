package day_13.multithreading;

public class Test {
    public static void main(String[] args) {
        // race condition
        Display display = new Display();
        Display display1 = new Display();
        Th th1 = new Th(display, "john");
        Th th2 = new Th(display1, "peter");
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        t1.start();
        t2.start();

    }
}

class Display {
//    public static synchronized void print(String name) {
//        for (int i = 0; i < 5; i++) {
//            System.out.print("hello ");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(name);
//        }
//    }

    public static void print(String name) {
//        synchronized (this){
        synchronized (Display.class) {
            for (int i = 0; i < 5; i++) {
                System.out.print("hello ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }
        }

        //
        //
        //
        //
    }
}

class Th implements Runnable {

    Display display;
    String name;

    public Th(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    @Override
    public void run() {
        display.print(name);
    }
}