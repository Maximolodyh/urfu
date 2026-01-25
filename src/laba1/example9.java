package laba1;
//task4
import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter month name: ");
        String month = in.nextLine();

        System.out.print("Enter number of days: ");
        int days = in.nextInt();

        System.out.println("The month " + month + " has " + days + " days.");

        in.close();
    }
}
