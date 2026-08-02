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
        System.out.println(binarySearch(list, 0, list.size() - 1, x));
    }

    private static int binarySearch(List<Integer> list, int low, int high, int target) {
        if (low <= high) {
            int mid = (low + high) / 2;
            int midValue = list.get(mid);
            if (midValue == target) {
                return mid;
            } else if (midValue > target) {
                return binarySearch(list, low, mid - 1, target);
            } else {
                return binarySearch(list, mid + 1, high, target);
            }
        }
        return -1;
    }

    private static void linearSearch(List<Integer> list, int x) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                System.out.println("found the x");
            }
        }
    }
}
