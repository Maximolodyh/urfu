package timus;

import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

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
