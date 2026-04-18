package day_11.collections;

public class ArrayDemo {
    // data structure -> create add update delete search

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        arrayDelete(arr, 3);
        increaseArrSize(arr, 5);
    }

    public static void increaseArrSize(int[] arr, int size) {
        System.out.println(arr[0]);
        // copy all the values to a temp array
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // increase the size of the array
        arr = new int[size];

        // copy all the values from temp array to new array
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println(arr[0]);
    }

    public static void arrayDelete(int[] arr, int val) {
        // find the value to be deleted
        // move all the values after the value to be deleted 1 position forward
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == val) {
                break;
            }
        }

        for (int j = i + 1; j < arr.length; j++) {
            arr[j - 1] = arr[j];
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}


// ArrayList