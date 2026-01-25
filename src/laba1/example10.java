package laba1;
//task5
import java.util.Scanner;

public class example10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int birthYear = in.nextInt();

        int currentYear = 2026;
        int age = currentYear - birthYear;

        System.out.println("You were born in " + age);

        in.close();
    }
}
