package lab09.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Раздел 6. Сравнение коллекций (вариант 9).
 * Коллекции: ArrayDeque, ArrayList, TreeSet.
 * Количество элементов: 9 * 1 000 000 = 9 000 000.
 */
public class CollectionComparison {

    private static final int VARIANT = 9;
    /** Полный объём по варианту; для быстрого теста: java -Dlab.n=100000 ... */
    private static final int N = Integer.getInteger("lab.n", VARIANT * 1_000_000);
    private static final int GET_ITERATIONS = Integer.getInteger("lab.get", VARIANT * 1_000_000);

    public static void main(String[] args) {
        System.out.println("Вариант " + VARIANT);
        System.out.println("Количество элементов N = " + N);
        System.out.println("Итераций получения по индексу = " + GET_ITERATIONS);
        System.out.println();

        printAddTable();
        printRemoveTable();
        printGetTable();
    }

    private static void printAddTable() {
        System.out.println("=== Таблица 1. Добавление ===");
        System.out.printf("%-12s | %-12s | %-12s | %-12s%n", "Коллекция", "в начало", "в середину", "в конец");
        System.out.println("-".repeat(55));

        long arrayListStart = timeAddFirstArrayList();
        long arrayListMiddle = timeAddMiddleArrayList();
        long arrayListEnd = timeAddEndArrayList();
        System.out.printf("%-12s | %8d мс | %8d мс | %8d мс%n",
                "ArrayList", arrayListStart, arrayListMiddle, arrayListEnd);

        long dequeStart = timeAddFirstArrayDeque();
        long dequeMiddle = timeAddMiddleArrayDeque();
        long dequeEnd = timeAddEndArrayDeque();
        System.out.printf("%-12s | %8d мс | %8s | %8d мс%n",
                "ArrayDeque", dequeStart, dequeMiddle == -1 ? "N/A" : dequeMiddle + " мс", dequeEnd);

        long treeStart = timeAddFirstTreeSet();
        long treeMiddle = timeAddMiddleTreeSet();
        long treeEnd = timeAddEndTreeSet();
        System.out.printf("%-12s | %8d мс | %8s | %8d мс%n",
                "TreeSet", treeStart, treeMiddle == -1 ? "N/A" : treeMiddle + " мс", treeEnd);
        System.out.println();
    }

    private static void printRemoveTable() {
        System.out.println("=== Таблица 2. Удаление ===");
        System.out.printf("%-12s | %-12s | %-12s | %-12s%n", "Коллекция", "в начале", "в середине", "в конце");
        System.out.println("-".repeat(55));

        System.out.printf("%-12s | %8d мс | %8d мс | %8d мс%n",
                "ArrayList", timeRemoveFirstArrayList(), timeRemoveMiddleArrayList(), timeRemoveEndArrayList());

        System.out.printf("%-12s | %8d мс | %8s | %8d мс%n",
                "ArrayDeque", timeRemoveFirstArrayDeque(), "N/A", timeRemoveEndArrayDeque());

        System.out.printf("%-12s | %8d мс | %8s | %8d мс%n",
                "TreeSet", timeRemoveFirstTreeSet(), "N/A", timeRemoveEndTreeSet());
        System.out.println();
    }

    private static void printGetTable() {
        System.out.println("=== Таблица 3. Получение по индексу ===");
        System.out.printf("%-12s | %-30s%n", "Коллекция", "По индексу (" + GET_ITERATIONS + " обращений)");
        System.out.println("-".repeat(50));
        System.out.printf("%-12s | %8d мс%n", "ArrayList", timeGetByIndexArrayList());
        System.out.printf("%-12s | %8d мс%n", "ArrayDeque", timeGetByIndexArrayDeque());
        System.out.printf("%-12s | %8d мс%n", "TreeSet", timeGetByIndexTreeSet());
    }

    // --- ArrayList ---

    private static long timeAddFirstArrayList() {
        List<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list.add(0, i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeAddMiddleArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(list.size() / 2, i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeAddEndArrayList() {
        List<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeRemoveFirstArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(0);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeRemoveMiddleArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        while (list.size() > 1) {
            list.remove(list.size() / 2);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeRemoveEndArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeGetByIndexArrayList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        int index = list.size() / 2;
        long start = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < GET_ITERATIONS; i++) {
            sum += list.get(index);
        }
        if (sum == -1) {
            System.out.print("");
        }
        return System.currentTimeMillis() - start;
    }

    // --- ArrayDeque ---

    private static long timeAddFirstArrayDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            deque.addFirst(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeAddMiddleArrayDeque() {
        return -1;
    }

    private static long timeAddEndArrayDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            deque.addLast(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeRemoveFirstArrayDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            deque.addLast(i);
        }
        long start = System.currentTimeMillis();
        while (!deque.isEmpty()) {
            deque.removeFirst();
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeRemoveEndArrayDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            deque.addLast(i);
        }
        long start = System.currentTimeMillis();
        while (!deque.isEmpty()) {
            deque.removeLast();
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeGetByIndexArrayDeque() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < Math.min(N, 100_000); i++) {
            deque.addLast(i);
        }
        int targetIndex = deque.size() / 2;
        long start = System.currentTimeMillis();
        for (int iteration = 0; iteration < 100_000; iteration++) {
            int currentIndex = 0;
            int value = 0;
            for (Integer item : deque) {
                if (currentIndex == targetIndex) {
                    value = item;
                    break;
                }
                currentIndex++;
            }
            if (value == -1) {
                System.out.print("");
            }
        }
        return System.currentTimeMillis() - start;
    }

    // --- TreeSet ---

    private static long timeAddFirstTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        long start = System.currentTimeMillis();
        for (int i = N; i > 0; i--) {
            set.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeAddMiddleTreeSet() {
        return -1;
    }

    private static long timeAddEndTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            set.add(i);
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeRemoveFirstTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        while (!set.isEmpty()) {
            set.pollFirst();
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeRemoveEndTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(i);
        }
        long start = System.currentTimeMillis();
        while (!set.isEmpty()) {
            set.pollLast();
        }
        return System.currentTimeMillis() - start;
    }

    private static long timeGetByIndexTreeSet() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < Math.min(N, 100_000); i++) {
            set.add(i);
        }
        int targetIndex = set.size() / 2;
        long start = System.currentTimeMillis();
        for (int iteration = 0; iteration < 100_000; iteration++) {
            int currentIndex = 0;
            int value = 0;
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                value = iterator.next();
                if (currentIndex == targetIndex) {
                    break;
                }
                currentIndex++;
            }
            if (value == -1) {
                System.out.print("");
            }
        }
        return System.currentTimeMillis() - start;
    }
}
