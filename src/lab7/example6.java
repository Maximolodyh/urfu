package lab7;

import java.util.Scanner;

public class example6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Timus 2012
        int f = in.nextInt();
        if (f >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Timus 1991
        int n = in.nextInt();
        int k = in.nextInt();

        int unused = 0;
        int lack = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a > k) unused += a - k;
            else lack += k - a;
        }

        System.out.println(unused + " " + lack);

        in.close();
    }
}