package day_14_15.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(5);
        list.add(50);

        System.out.println(list);
        Comparator<Integer> comparator = (o1, o2) -> o2.compareTo(o1);
        list.sort(comparator);
        System.out.println(list);

    }
}

