package day_14_15.java8;

import java.util.Comparator;

public class MethodReference {
    public static void main(String[] args) {
        Z z = (a, b) -> System.out.println(a + b);

        Test test = new Test();
//        Z z1 = test::m1;
//        Z z1 = Test::m2;
        Z z1 = Test::new;

        z.add(100, 200);
        z1.add(100, 200);


//        Comparator<Integer> comparator = Integer::compareTo;
        Comparator<Integer> comparator = Comparator.reverseOrder();
        System.out.println(comparator.compare(1, 2));
    }
}

interface Z {
    public void add(int a, int b);
}

class Test {

    public Test() {

    }

    public Test(int a, int b) {
        System.out.println(a + b);
    }

    public void m1(int a, int b) {
        System.out.println(a + b);
    }

    public static void m2(int a, int b) {
        System.out.println(a + b);
    }
}