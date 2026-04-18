package day_11.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(100);
        list.add(200);
        list.add(300);

        list.remove(2);

        System.out.println(list.contains(2));
        System.out.println(list.size());

        System.out.println(list);
    }
}
