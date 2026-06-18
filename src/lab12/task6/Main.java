package task6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

        public static void main(String[] args) throws Exception { // Тестовый массив: 10 миллионов единиц. Ожидаемая сумма = 10 000 000
            int[] array = new int[10_000_000];
            for (int i = 0; i < array.length; i++) {
                array[i] = 1;
            }

            long start = System.currentTimeMillis();
            long totalSum = calculateSum(array);
            long end = System.currentTimeMillis();

            System.out.printf("Total Sum: %d (Calculated in %d ms)%n", totalSum, (end - start));
        }

        public static long calculateSum(int[] array) throws InterruptedException, ExecutionException {
            if (array == null || array.length == 0) {
                return 0;
            }

            int cores = Runtime.getRuntime().availableProcessors();
            ExecutorService executor = Executors.newFixedThreadPool(cores);
            List<Future<Long>> futures = new ArrayList<>();

            int chunkSize = (int) Math.ceil((double) array.length / cores);

            for (int i = 0; i < cores; i++) {
                final int start = i * chunkSize;
                final int end = Math.min(start + chunkSize, array.length);

                if (start >= array.length) break;

                futures.add(executor.submit(() -> {
                    long localSum = 0;
                    for (int j = start; j < end; j++) {
                        localSum += array[j];
                    }
                    return localSum;
                }));
            }

            // Сбор промежуточных сумм воедино
            long globalSum = 0;
            for (Future<Long> future : futures) {
                globalSum += future.get();
            }

            executor.shutdown();
            return globalSum;
        }
    }
