package timus;

import java.util.Scanner;

public class example16 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Timus 1319\nВведите размер матрицы: ");
        int rows = in.nextInt();

        int cols = rows;

        int[][] a = new int[rows][cols];

        int num = 1;

        for (int d = -(cols - 1); d <= (rows - 1); d++) {

            int r = Math.max(0, d);
            int c = r - d;

            while (r < rows && c < cols) {
                a[r][c] = num++;
                r++;
                c++;
            }
        }

        // вывод
        System.out.println("\nвывод полок отеля: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
