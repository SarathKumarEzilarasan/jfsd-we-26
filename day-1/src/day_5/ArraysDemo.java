package day_5;

import day_3.User;

public class ArraysDemo {
    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                arr[i][j] = i * j;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][] arr1 = {
                {1, 1},
                {2, 2}
        };
        int[][] arr2 = {
                {1, 1},
                {2, 2}
        };

        matrixMultiplication(arr1, arr2);

    }

    public static void OneDArray() {
        // data structure -> create add read delete update search
//        int[] arr = new int[8];
        int[] arr = {10, 1, 8, 12, -1};
        String[] str = new String[10];
        User[] users = new User[10];
        // locations or index

//        sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        findMax(arr);
        findSecondMax(arr);
    }

    public static void arrayOperations(int[] arr) {
        arr[0] = 1000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 100;
        }
        int x = 200;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("found the required value");
            }
        }
        System.out.println(arr[arr.length - 1]);
    }

    // bubble sort
    // time  ->  o(n*n) -> o(n2)
    // space ->  o(1)
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // time  -> o(n)
    // space -> o(1)
    public static void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    // findMin

    // time  -> o(n)
    // space -> o(1)
    public static void findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] > sMax) {
                sMax = arr[i];
            }
        }

        System.out.println(sMax);
    }

    // findThirdMax


    // time  -> o(n3)
    // space -> o(n)
    public static void matrixMultiplication(int[][] arr1, int[][] arr2) {
        int len = arr1.length;
        int[][] result = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                for (int k = 0; k < len; k++) {
                    result[i][j] = result[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
