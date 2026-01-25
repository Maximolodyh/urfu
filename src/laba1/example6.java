package laba1;
//task1
import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter last name: ");
        String lastName = in.nextLine();

        System.out.print("Enter first name: ");
        String firstName = in.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = in.nextLine();

        System.out.println("Hello " + lastName + " " + firstName + " " + middleName);

        in.close();
    }
}
