package laba1;
//task6
import java.util.Scanner;

public class example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = in.nextLine();

        System.out.print("Enter year were born: ");
        int birthYear = in.nextInt();

        int currentYear = 2026;
        int age = currentYear - birthYear;

        System.out.println("hello " + name + ", Your age: " + age);

        in.close();
    }
}
