package day_17.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList();
//
//        list.add(1);
//        list.add(1);
//        list.add(1);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i) / 100);
//        }

        Gen<Integer> gen = new Gen<>(100);
        gen.equals(100, 200);

        Gen<Long> gen1 = new Gen<>(100l);
        gen1.equals(100l, 200l);

        gen1.sub(100, 200);

    }
}

class Gen<T extends Number> {
    private T i;

    public Gen(T i) {
        this.i = i;
    }

    public void equals(T a, T b) {
        System.out.println(a.equals(b));
    }

    public <V> void sub(V v1, V v2) {

    }
}
