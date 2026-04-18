package day_14.java8;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // class -> anonymous class -> lambda expression if its a functional interface
//        Runnable runnable = () -> System.out.println("from child thread");
//
//        Thread thread = new Thread(runnable);
//        thread.start();


        I i = (a, b) -> a + b;
        System.out.println(i.add(100, 200));


    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("from child thread");
    }
}

@FunctionalInterface
interface I {
    public int add(int a, int b);
//    public int sub(int a, int b);
}

class B implements I {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

//    @Override
//    public int sub(int a, int b) {
//        return 0;
//    }
}