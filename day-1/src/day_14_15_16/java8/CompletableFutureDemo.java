package day_14_15_16.java8;

import java.util.concurrent.*;

public class CompletableFutureDemo {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 20);
//        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 40);
//
//        CompletableFuture<Integer> combinedFuture = future.thenCombine(future1, (result1, result2) -> result1 + result2);
////        System.out.println(combinedFuture.join());
//
//
//        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(
//                () -> {
//                    throw new RuntimeException("Something went wrong");
//                });
//
//        CompletableFuture<Integer> exceptionHandledFuture = future2.exceptionally(ex -> {
//            System.out.println(ex.getMessage());
//            return 0;
//        });
//
//        System.out.println(exceptionHandledFuture.join());
//
//    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Future<Integer> future = service.submit(() -> 20);
            System.out.println(future.get());
        }

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        ScheduledFuture scheduledFuture =
                scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("credit salary"), 0, 30, TimeUnit.DAYS);

        service.shutdownNow();
    }


}
