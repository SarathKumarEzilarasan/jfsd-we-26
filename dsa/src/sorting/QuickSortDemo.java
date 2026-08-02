package sorting;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] array = {2, 3, 0, 1, 5};

        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    // time  -> o(n log n)
    // space -> o(1)
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        i++;
        swap(array, i, high);
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
