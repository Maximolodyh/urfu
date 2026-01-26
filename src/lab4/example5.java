package lab4;

import java.util.Random;

public class example5 {
    public static void main(String[] args) {

        int rows = 3;
        int cols = 5;

        int[][] array = new int[rows][cols];
        Random random = new Random();

        // заполнение исходного массива случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        // вывод исходного массива
        System.out.println("изначальный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("изначальный массив на боку без создания второго массива:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = array[i][j];
            }
        }

        // вывод нового массива
        System.out.println("вывод с использованием второго массива:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}

