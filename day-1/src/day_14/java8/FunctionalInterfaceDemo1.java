package day_14.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        // Predicate , Function , Consumer , Supplier

//        predicate();
//        function();
//        consumer();
//        supplier();
    }

    private static void supplier() {
        Supplier<Integer> supplier = () -> 100;
        System.out.println(supplier.get());
    }


    public static void consumer() {
        Consumer<Integer> consumer = i -> System.out.println(i);
        consumer.accept(10);
    }

    public static void function() {
        Function<Integer, Integer> function = i -> i * i;
        System.out.println(function.apply(10));
    }

    public static void predicate() {
        List<Integer> list = Arrays.asList(10, 4, 1, 3, 20, 18);
        Predicate<Integer> predicate = i -> i % 2 == 0;
        Predicate<Integer> predicate1 = i -> i > 5;

        for (int i : list) {
            if (predicate.and(predicate1).test(i)) {
                System.out.println(i);
            }
        }
    }
}
