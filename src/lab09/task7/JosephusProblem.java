package lab09.task7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Задание 7. Задача Иосифа Флавия: сравнение ArrayList и LinkedList.
 */
public class JosephusProblem {

    private static final int DEFAULT_N = 41;

    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_N;

        int[] arrayListWinner = new int[1];
        int[] linkedListWinner = new int[1];

        long arrayListTime = measureTime(() -> arrayListWinner[0] = solveWithArrayList(n));
        long linkedListTime = measureTime(() -> linkedListWinner[0] = solveWithLinkedList(n));

        System.out.println("N = " + n);
        System.out.println("Победитель (ArrayList): человек №" + arrayListWinner[0]);
        System.out.println("Победитель (LinkedList): человек №" + linkedListWinner[0]);
        System.out.println("Время ArrayList:  " + arrayListTime + " мс");
        System.out.println("Время LinkedList: " + linkedListTime + " мс");

        if (arrayListTime < linkedListTime) {
            System.out.println("Быстрее работает ArrayList.");
            System.out.println("Причина: удаление по индексу в середине ArrayList требует сдвига элементов,");
            System.out.println("но доступ по индексу O(1). Для LinkedList удаление O(1) после поиска,");
            System.out.println("но поиск позиции O(n). На практике для данной задачи результат зависит от N и JVM.");
        } else {
            System.out.println("Быстрее работает LinkedList.");
            System.out.println("Причина: при частых удалениях из середины LinkedList не сдвигает весь массив,");
            System.out.println("в отличие от ArrayList, где каждое удаление сопровождается копированием хвоста.");
        }
    }

    public static int solveWithArrayList(int n) {
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
            if (index == people.size()) {
                index = 0;
            }
        }
        return people.get(0);
    }

    public static int solveWithLinkedList(int n) {
        List<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
            if (index == people.size()) {
                index = 0;
            }
        }
        return people.get(0);
    }

    private static long measureTime(Runnable task) {
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        return (end - start) / 1_000_000;
    }
}
