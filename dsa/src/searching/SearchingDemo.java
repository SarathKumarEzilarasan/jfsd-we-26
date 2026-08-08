package searching;

import java.util.Arrays;
import java.util.List;

public class SearchingDemo {
    //linear search -> o(n)
    //binary search -> o(log n)

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7);
        int x = 7;

//        linearSearch(list, x);
    }

    private static void linearSearch(List<Integer> list, int x) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                System.out.println("found the x");
            }
        }
    }
}
