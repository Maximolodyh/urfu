package task4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
        private static final int THREAD_COUNT = 10;

        public static void main(String[] args) {
            ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
            CountDownLatch latch = new CountDownLatch(THREAD_COUNT);

            for (int i = 1; i <= THREAD_COUNT; i++) {
                final int threadNumber = i;
                executor.submit(() -> {
                    try {
                        System.out.printf("Thread #%d is executing.%n", threadNumber);
                    } finally {
                        latch.countDown();
                    }
                });
            }

            try {
                latch.await(); // Ожидаем завершения всех 10 потоков
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                executor.shutdown();
            }
        }
    }
