package lab5;

import java.util.Scanner;

public class example7 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
        // отель Timus 1319
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


        //Timus 1787 пробка перед мегой
        System.out.print("Timus 1787.\nВведите количество машин способных проехать за минуту и за сколько минут данный вывод был сделан: ");
        int k = in.nextInt();
        int m = in.nextInt();
        int cars = 0;

        for (int i = 0; i < m; i++) {
            System.out.print("введите количество машин приехавших за минуту: ");
            cars += in.nextInt();
            if (cars > k) {
                cars -= k;
            } else {
                cars = 0;
            }
        }

        System.out.println("машин в пробке перед МЕГОЙ: " + cars);

        in.close();
    }
}
