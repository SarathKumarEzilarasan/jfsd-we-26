package day_14_15_16.java8;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        ForkJoinPool pool = new ForkJoinPool();

        SumTask task = new SumTask(array, 0, array.length);

        long result = pool.invoke(task);
        System.out.println(result);

    }
}


class SumTask extends RecursiveTask<Long> {
    private static int THRESHOLD = 10;
    private int[] array;
    private int start, end;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }


    @Override
    protected Long compute() {
        if ((end - start) <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        }

        int mid = (start + end) / 2; // 25

        SumTask leftTask = new SumTask(array, start, mid); // 0-50
        SumTask rightTask = new SumTask(array, mid, end);  // 51-100

        leftTask.fork(); // lt -> lt1[25] -> lt2[12] , rt2[12] , rt1[25] -> lt3[12], rt3[12]

        long rightResult = rightTask.compute();

        long leftResult = leftTask.join();

        return leftResult + rightResult;
    }
}