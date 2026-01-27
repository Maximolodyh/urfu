package timus;

import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Timus 1409\n");
        System.out.print("Введите количество выстрелов Гарри : ");
        int harry = in.nextInt();
        System.out.print("Введите количесво выстеллов Ларри: ");
        int larry = in.nextInt();

        int total = harry + larry - 1;
        System.out.println("Гарри не попадал в : " + (total - harry) + " банок");
        System.out.println("Ларри не попадал в : " + (total - larry) + " банок");
        in.close();
    }
}
