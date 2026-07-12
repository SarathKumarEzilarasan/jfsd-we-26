package sorting;

import java.util.Arrays;

public class BubbleSort {
//    time  -> o(n2)
//    space -> o(1)

    public static void main(String[] args) {
        int[] array = {2, 3, 0, 1, 5};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}

