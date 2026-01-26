package lab3;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println("вывод с использованием цикла for:");
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("вывод с использованием цикла while:");
        int i = min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        System.out.println("вывод с использованием цикла do-while:");
        i = min;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= max);

        in.close();
    }
}
