package lab3;

import java.util.Random;

public class example9 {
    public static void main(String[] args) {

        int size = 10;
        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // 0..99
        }

        // вывод массива
        System.out.println("Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // поиск минимального значения элемента массива
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // вывод минимального значения элемента массива и если есть дубликаты вывод всех его индексов
        System.out.println("Minimum value: " + min);
        System.out.print("Index(es): ");

        for (int i = 0; i < size; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
