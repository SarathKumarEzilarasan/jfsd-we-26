package day_9_10.oops.polymorphism.overloading;

public class OverloadingDemo {
//    	- adding new arguments to make a function unique
//		- datatype of arguments

    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
        add(10l, 20);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(long a, int b) {
        System.out.println(a + b);
    }

//    public static int add(long a, int b) {
//        System.out.println(a + b);
//        return 0;
//    }

}
