package laba1;
//task8
import java.util.Scanner;

public class example13 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int first_number = in.nextInt();

        System.out.print("Enter your second number: ");
        int second_number = in.nextInt();

        int sum = first_number + second_number;

        System.out.println("Sum your numbers = " + sum);

        in.close();
    }
}
