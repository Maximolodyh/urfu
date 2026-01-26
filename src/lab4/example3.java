package lab4;

public class example3 {
    public static void main(String[] args) {

        int rows = 11;
        int cols = 23;

        int[][] array = new int[rows][cols];

        // заполнение массива цифрами 2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 2;
            }
        }

        // вывод прямоугольника
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + array[i][j]); // пробел для красоты (чтобы длинная сторона была длинней)
            }
            System.out.println();
        }
    }
}
