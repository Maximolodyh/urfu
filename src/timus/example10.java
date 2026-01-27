package timus;

import java.util.Scanner;

public class example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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
    }
}
