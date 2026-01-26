package lab4;

import java.util.Random;

public class example6 {
    public static void main(String[] args) {

        int rows = 5;
        int cols = 6;

        int[][] array = new int[rows][cols];
        Random random = new Random();

        // инициализация исходного массива
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

        // случайные индексы строки и столбца для удаления
        int removeRow = random.nextInt(rows);
        int removeCol = random.nextInt(cols);

        System.out.println("удаление строки и индексом: " + removeRow);
        System.out.println("удаление столбца с индексом: " + removeCol);

        // новый массив без выбранной строки и столбца
        int[][] newArray = new int[rows - 1][cols - 1];

        int newI = 0;
        for (int i = 0; i < rows; i++) {
            if (i == removeRow) continue;

            int newJ = 0;
            for (int j = 0; j < cols; j++) {
                if (j == removeCol) continue;

                newArray[newI][newJ] = array[i][j];
                newJ++;
            }
            newI++;
        }

        // вывод нового массива
        System.out.println("Новый массив:");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[0].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
