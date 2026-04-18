package day_11.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    // List
    // data structure -> create add update delete read search
    // 10 -> 75% -> new array of size 20 -> copy the data to the new data

    // Generics

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1000);
        list.add(2000);
        list.add(3000);
        list.add(4000);


    }


    public static void generics() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
//        list.add(1.00);
//        list.add("100");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) / 100);
        }

        // for each
        for (int i : list) {
            System.out.println(i);
        }
    }

    public static void arrayList() {
        List list = new ArrayList(100);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.remove(2);
        list.set(3, 100);

        System.out.println(list.get(1));
        System.out.println(list.contains(40));
        System.out.println(list.size());
        System.out.println(list);

    }
}

// [1,2,3,4,5]
