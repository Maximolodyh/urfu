package lab3;

import java.util.Random;

public class example10 {
    public static void main(String[] args) {

        int size = 10;
        int[] array = new int[size];

        Random random = new Random();

        // заполнение массива случайными числами
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // 0..99
        }

        // вывод исходного массива
        System.out.println("изначальный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // сортировка по убыванию методом пузырька
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // вывод отсортированного массива в порядке убывания
        System.out.println("отсортированный массив в порядке убывания:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
