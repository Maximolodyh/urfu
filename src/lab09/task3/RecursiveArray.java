package lab09.task3;

import java.util.Scanner;

/**
 * Задание 3. Ввод и вывод одномерного массива рекурсивными методами.
 */
public class RecursiveArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите " + size + " целых чисел:");
        inputArray(array, 0, scanner);

        System.out.print("Массив: ");
        outputArray(array, 0);
        System.out.println();
        scanner.close();
    }

    public static void inputArray(int[] array, int index, Scanner scanner) {
        if (index >= array.length) {
            return;
        }
        array[index] = scanner.nextInt();
        inputArray(array, index + 1, scanner);
    }

    public static void outputArray(int[] array, int index) {
        if (index >= array.length) {
            return;
        }
        System.out.print(array[index]);
        if (index < array.length - 1) {
            System.out.print(", ");
        }
        outputArray(array, index + 1);
    }
}
