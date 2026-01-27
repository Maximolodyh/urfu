package timus;

import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Timus 1293.\nEnter numbers N, A, B: ");
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Result: " + (2 * n * a * b));
    }
}
