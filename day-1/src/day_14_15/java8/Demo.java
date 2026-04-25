package day_14_15.java8;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 1, 3, 4, 20, 0);
//        List<Integer> evenList = new ArrayList<>();
//        List<Integer> sqList = new ArrayList<>();
//
//        for (int i : list) {
//            if (i % 2 == 0) {
//                evenList.add(i);
//            }
//        }
//
//        for (int i : evenList) {
//            sqList.add(i * i);
//        }
//
//        System.out.println(evenList);
//        System.out.println(sqList);

        List<Integer> evenList = list.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i > 5)
                .map(i -> i * i)
                .toList();

        System.out.println(evenList);
    }
}
