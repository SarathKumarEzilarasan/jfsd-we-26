package day_14_15.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1);

//        Stream.of(1, 2, 3, 4, 5, 6)
//                .filter()
//                .map()

//        List<Integer> sorted = list.stream()
//                .sorted((o1, o2) -> o2.compareTo(o1))
//                .distinct()
//                .limit(4)
//                .skip(2)
//                .toList();

//        List<Integer> sorted = list.stream()
//                .sorted((o1, o2) -> o2.compareTo(o1))
//                .distinct()
//                .limit(4)
//                .skip(2)
//                .collect(Collectors.toList());


//        sorted.forEach(i -> System.out.println(i));

//        int sum = list.stream()
//                .reduce((a, b) -> a + b).get();

//        Optional<Integer> optional = list.stream()
//                .reduce((a, b) -> a + b);

//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

//        System.out.println(optional.orElse(10));

//        int sum = list.stream()
//                .reduce(10, (a, b) -> a + b);
//
//        System.out.println(sum);

//        int i = list.stream().findFirst().get();
//        int j = list.stream().findAny().get();
//        System.out.println(j);

//        boolean numbers = list.stream()
//                .noneMatch(i -> i % 2 == 0);
//        System.out.println(numbers);

        List<Integer> l = list.stream()
                .toList();

        Set<Integer> set = list.stream()
                .collect(Collectors.toSet());
//        System.out.println(set);


        Map<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        i -> i * 10,
                        i -> i,
                        (oldVal, newVal) -> newVal
                ));

//        System.out.println(map);

        Map<Boolean, List<Integer>> partition = list.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

//        System.out.println(partition);

        Map<Integer, List<Integer>> grouping = list.stream()
                .collect(Collectors.groupingBy(i -> i / 2));

//        System.out.println(grouping);


        String s = Stream.of("john", "peter", "zack")
                .collect(Collectors.joining(","));

//        System.out.println(s);

        Stream.of(1, 2, 4, 5);
        Stream.of("john", "peter", "zack");


        IntStream.of(1, 2, 4, 5).summaryStatistics();


    }
}
