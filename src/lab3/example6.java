package lab3;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        if (!in.hasNextInt()) {
            System.out.println("число должно быть целым");
            in.close();
            return;
        }

        int size = in.nextInt();

        if (size <= 0) {
            System.out.println("число должно быть больше нуля");
            in.close();
            return;
        }

        int[] array = new int[size];

        int value = 2;
        for (int i = 0; i < size; i++) {
            array[i] = value;
            value += 5;
        }

        System.out.println("элементы итогового массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        in.close();
    }
}
