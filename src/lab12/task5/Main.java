package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
        public static void main(String[] args) throws Exception {
            // Тестовый массив на 50 миллионов элементов
            int[] array = new int[50_000_000];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
            array[25_000_000] = 999_999_999; // Внедряем максимум в середину
            long start = System.currentTimeMillis();
            int max = findMax(array);
            long end = System.currentTimeMillis();
            System.out.printf("Max value: %d (Found in %d ms)%n", max, (end - start));
        }

        public static int findMax(int[] array) throws InterruptedException, ExecutionException {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array must not be empty");
            }
            int cores = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(cores);
            List<Future<Integer>> futures = new ArrayList<>();

            int chunkSize = (int) Math.ceil((double) array.length / cores);

            // Разделение работы между потоками
            for (int i = 0; i < cores; i++) {
                final int start = i * chunkSize;
                final int end = Math.min(start + chunkSize, array.length);

                if (start >= array.length) break;

                futures.add(executor.submit(() -> {
                    int localMax = array[start];
                    for (int j = start + 1; j < end; j++) {
                        if (array[j] > localMax) {
                            localMax = array[j];
                        }
                    }
                    return localMax;
                }));
            }

            // Агрегация результатов
            int globalMax = Integer.MIN_VALUE;
            for (Future<Integer> future : futures) {
                globalMax = Math.max(globalMax, future.get());
            }

            executor.shutdown();
            return globalMax;
        }
    }
