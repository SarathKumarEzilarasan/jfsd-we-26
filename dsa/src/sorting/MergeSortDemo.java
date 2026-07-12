package sorting;

import java.util.Arrays;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] array = {2, 3, 0, 1, 5};

        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    // time -> o(n log n) > o(n2)
    // space -> o(n)
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid); // log n
            mergeSort(array, mid + 1, right); // log n

            merge(array, left, mid, right); // o(n)
        }
    }

    //   time -> o(n)
    private static void merge(int[] array, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(array, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(array, mid + 1, right + 1);

        int n1 = leftArr.length;
        int n2 = rightArr.length;

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                array[k++] = leftArr[i++];
            } else {
                array[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArr[i++];
        }

        while (j < n2) {
            array[k++] = rightArr[j++];
        }
    }


}


// 4 -> 2
// 8 -> 3
// log 4 -> log 2^2 -> 2 log 2 -> 2
// log 8 -> log 2^3 -> 3 log 2 -> 3