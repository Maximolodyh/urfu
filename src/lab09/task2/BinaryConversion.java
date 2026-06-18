package lab09.task2;

import java.util.Scanner;

/**
 * Задание 2. Рекурсивный перевод целого числа в двоичную систему счисления.
 */
public class BinaryConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number == 0) {
            System.out.println("Двоичное представление: 0");
            return;
        }

        System.out.print("Двоичное представление: ");
        printBinary(Math.abs(number));
        if (number < 0) {
            System.out.print(" (для отрицательного числа выведен модуль)");
        }
        System.out.println();
    }

    public static void printBinary(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        }
        printBinary(n / 2);
        System.out.print(n % 2);
    }
}
