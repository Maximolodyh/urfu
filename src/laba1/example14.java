package laba1;
//task9
import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int b = a - 1;
        int c = a + 1;
        int d = (a * a) + (b * b) + (c * c) + 2*a*c + 2*a*b + 2*b*c;

        System.out.println(a + ", "+ b + ", " + c + ", " + d);

        in.close();
    }
}
