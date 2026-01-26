package lab4;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Timus 1293.\nEnter numbers N, A, B: ");
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Result: " + (2 * n * a * b));

        System.out.print("Timus 1785.\nEnter number: ");
        int x = in.nextInt();

        if (x >= 1 && x <= 4) {
            System.out.println("few");
        } else if (x <= 9) {
            System.out.println("several");
        } else if (x <= 19) {
            System.out.println("pack");
        } else if (x <= 49) {
            System.out.println("lots");
        } else if (x <= 99) {
            System.out.println("horde");
        } else if (x <= 249) {
            System.out.println("throng");
        } else if (x <= 499) {
            System.out.println("swarm");
        } else if (x <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }

        in.close();
    }
}
