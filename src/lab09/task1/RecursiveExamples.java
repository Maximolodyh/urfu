package lab09.task1;

import java.util.Scanner;

/**
 * Задание 1. Демонстрация примеров 1–5 из раздела «Рекурсивные алгоритмы».
 */
public class RecursiveExamples {

    public static void main(String[] args) {
        System.out.println("=== Пример 1: последовательность x = 2*x+1, 0 <= x < 20 ===");
        printSequence(0);

        System.out.println("\n=== Пример 2: та же последовательность в обратном порядке ===");
        printSequenceReverse(0);

        System.out.println("\n=== Пример 3: вывод до и после рекурсивного вызова ===");
        printBeforeAfter(0);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n=== Пример 4: факториал. Введите n: ");
        int n = scanner.nextInt();
        System.out.println(n + "! = " + factorial(n));

        System.out.print("=== Пример 5: число Фибоначчи. Введите номер: ");
        int fibIndex = scanner.nextInt();
        System.out.println("F(" + fibIndex + ") = " + fibonacci(fibIndex));
        System.out.println("Дерево рекурсивных вызовов (обход):");
        printFibonacciCallTree(fibIndex, 0);
        scanner.close();
    }

    /** Пример 1 */
    public static void printSequence(int x) {
        if (x >= 0 && x < 20) {
            System.out.print(x + " ");
            printSequence(2 * x + 1);
        }
    }

    /** Пример 2 */
    public static void printSequenceReverse(int x) {
        if (x >= 0 && x < 20) {
            printSequenceReverse(2 * x + 1);
            System.out.print(x + " ");
        }
    }

    /** Пример 3 */
    public static void printBeforeAfter(int x) {
        if (x >= 0 && x < 20) {
            System.out.println("До вызова: x = " + x);
            printBeforeAfter(2 * x + 1);
            System.out.println("После вызова: x = " + x);
        }
    }

    /** Пример 4 */
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /** Пример 5 */
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /** Обход дерева рекурсивных вызовов для чисел Фибоначчи */
    public static void printFibonacciCallTree(int n, int depth) {
        String indent = "  ".repeat(depth);
        System.out.println(indent + "fib(" + n + ")");
        if (n > 1) {
            printFibonacciCallTree(n - 1, depth + 1);
            printFibonacciCallTree(n - 2, depth + 1);
        }
    }
}
