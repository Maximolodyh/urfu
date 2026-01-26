package lab4;

public class example7 {
    public static void main(String[] args) {

        int rows = 6;
        int cols = 10;

        int[][] array = new int[rows][cols];

        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // слева направо
                for (int j = 0; j < cols; j++) {
                    array[i][j] = value++;
                }
            } else {
                // справа налево
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }

        // вывод массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
