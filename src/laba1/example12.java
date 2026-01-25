package laba1;
//task7
import java.util.Scanner;

public class example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("How old are you: ");
        int age = in.nextInt();

        int currentYear = 2026;
        int birthYear = currentYear - age;

        System.out.println("You are so old:  " + birthYear + " years old");

        in.close();
    }
}
