package laba1;
//task10
import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int sum = a + b;
        int raznostb = a - b;

        System.out.println("Sum = " + sum);
        System.out.println("Raznostb = " + raznostb);

        in.close();
    }
}
