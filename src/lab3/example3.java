package lab3;

import java.util.Scanner;

public class example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите сколько чисел фибоначчи вы хотите увидеть: ");
        int n = in.nextInt();

        System.out.println("вывод фибоначчи созданных с помощью цикла for:");

        int a = 1;
        int b = 1;

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println();

        System.out.println("Вывод фибоначчи созданных с помощью цикла while:");

        a = 1;
        b = 1;
        int count = 1;

        while (count <= n) {
            if (count == 1 || count == 2) {
                System.out.print("1 ");
            } else {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            count++;
        }

        in.close();
    }
}
