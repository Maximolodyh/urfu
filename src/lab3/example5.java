package lab3;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many numbers to sum: ");
        int count = in.nextInt();

        System.out.println("вывод с тспользованием цикла for:");

        int found = 0;
        int number = 1;
        int sum = 0;

        for (; found < count; number++) {
            if (number % 5 == 2 || number % 3 == 1) {
                System.out.print(number + " ");
                sum += number;
                found++;
            }
        }

        System.out.println();
        System.out.println("Sum = " + sum);

        System.out.println("вывод с использованием цикла while:");

        found = 0;
        number = 1;
        sum = 0;

        while (found < count) {
            if (number % 5 == 2 || number % 3 == 1) {
                System.out.print(number + " ");
                sum += number;
                found++;
            }
            number++;
        }

        System.out.println();
        System.out.println("Sum = " + sum);

        in.close();
    }
}
