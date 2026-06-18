package task2;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
            Thread workerThread = new Thread(() -> {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        System.err.println("Thread was interrupted");
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }, "Worker-Thread");

            workerThread.start();
        }
    }
