package laba1;
//task3
import java.util.Scanner;

public class example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter day of week: ");
        String dayOfWeek = in.nextLine();

        System.out.print("Enter name month: ");
        String month = in.nextLine();

        System.out.print("Enter day of month: ");
        int day = in.nextInt();

        System.out.println("Today is " + dayOfWeek + ", " + day + " " + month);

        in.close();
    }
}
