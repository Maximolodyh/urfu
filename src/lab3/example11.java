package lab3;

import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Timus 1409\n");
        System.out.print("Enter Harry shots : ");
        int harry = in.nextInt();
        System.out.print("Enter Larry shots: ");
        int larry = in.nextInt();

        int total = harry + larry - 1;
        System.out.println("Harry missed: " + (total - harry));
        System.out.println("Larry missed: " + (total - larry));

        System.out.print("Timus 1264\n");
        System.out.print("Enter lines: ");
        int n = in.nextInt();
        System.out.print("Enter days: ");
        int m = in.nextInt();

        System.out.println("Result: " + (n * (m + 1)));

        in.close();
    }
}
