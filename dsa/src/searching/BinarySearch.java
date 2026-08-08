package searching;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7);
//        int x = 7;
//        System.out.println(binarySearch(list, 0, list.size() - 1, x));

        int[] nums = {3, 4, 5, 6, 1, 2};
        System.out.println(findMin(nums, 0, nums.length - 1));
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

    // time -> o(log n)
    // space -> o(1)
    //    https://neetcode.io/problems/find-minimum-in-rotated-sorted-array/question?list=blind75
    public static int findMin(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = (left + right) / 2;

        if (nums[mid] > nums[right]) {
            return findMin(nums, mid + 1, right);
        } else {
            return findMin(nums, left, mid);
        }
    }
}
