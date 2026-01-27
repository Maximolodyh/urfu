package timus;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
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
