package timus;

import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Task 1 (Timus 2066)\n");
        System.out.println("Enter three integers a, b and c:");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min = a + b + c;
        min = Math.min(min, a * b + c);
        min = Math.min(min, a + b * c);
        min = Math.min(min, a * (b + c));
        min = Math.min(min, (a + b) * c);
        min = Math.min(min, a * b * c);

        System.out.println("Minimum value: " + min);
    }
}
