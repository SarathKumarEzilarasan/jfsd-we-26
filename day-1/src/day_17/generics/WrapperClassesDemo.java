package day_17.generics;

public class WrapperClassesDemo {
    public static void main(String[] args) {
        int j = 100;
        Integer i = 100;

        Long l1 = Long.valueOf(128l);
        Long l2 = 128l;

        System.out.println(l1 == l2);


        System.out.println(Integer.parseInt("111"));


    }
}
