package task1;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

        private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

        public static void main(String[] args) {
            ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

            Runnable printTask = () -> {
                String threadName = Thread.currentThread().getName();
                String currentTime = LocalTime.now().format(TIME_FORMATTER);
                System.out.printf("[%s] Current Time: %s%n", threadName, currentTime);
            };

            // Запуск двух задач с фиксированным интервалом в 1 секунду
            executor.scheduleAtFixedRate(printTask, 0, 1, TimeUnit.SECONDS);
            executor.scheduleAtFixedRate(printTask, 0, 1, TimeUnit.SECONDS);

            // Главный поток ждет 10 секунд, затем принудительно останавливает исполнитель
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                executor.shutdownNow();
                System.out.println("Main: Execution finished after 10 seconds.");
            }
        }
    }
