package progect1;

import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        // Timus 1000 — A + B
        System.out.print("Enter first number (a): ");
        int a = in.nextInt();

        System.out.print("Enter second number (b): ");
        int b = in.nextInt();

        System.out.println("A + B = " + (a + b));

        // Timus 1068 — Sum
        System.out.print("Enter n for sum task: ");
        int n = in.nextInt();

        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            for (int i = n; i <= 1; i++) {
                sum += i;
            }
        }

        System.out.println("Sum = " + sum);

        // Timus 1204 — Idempotents
        System.out.print("Enter number for idempotents task: ");
        long x = in.nextLong();

        System.out.println("Result = " + (x * x + 1));

        in.close();
	}

}
