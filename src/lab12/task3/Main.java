package task3;

public class Main {
        private static final int MAX_NUMBER = 10;
        private final Object lock = new Object();
        private int currentNumber = 1;

        public static void main(String[] args) {
            Main printer = new Main();

            Thread oddThread = new Thread(printer::printOdd, "Odd-Thread");
            Thread evenThread = new Thread(printer::printEven, "Even-Thread");

            oddThread.start();
            evenThread.start();
        }

        private void printOdd() {
            synchronized (lock) {
                while (currentNumber <= MAX_NUMBER) {
                    if (currentNumber % 2 == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        System.out.printf("[%s]: %d%n", Thread.currentThread().getName(), currentNumber);
                        currentNumber++;
                        lock.notifyAll();
                    }
                }
            }
        }

        private void printEven() {
            synchronized (lock) {
                while (currentNumber <= MAX_NUMBER) {
                    if (currentNumber % 2 != 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    } else {
                        System.out.printf("[%s]: %d%n", Thread.currentThread().getName(), currentNumber);
                        currentNumber++;
                        lock.notifyAll();
                    }
                }
            }
        }
    }

