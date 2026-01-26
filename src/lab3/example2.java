package lab3;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter day of week: ");
        String day = in.nextLine().toLowerCase();

        // использование условных операторов
        if (day.equals("monday")) {
            System.out.println("1 день недели");
        } else if (day.equals("tuesday")) {
            System.out.println("2 день недели");
        } else if (day.equals("wednesday")) {
            System.out.println("3 день недели");
        } else if (day.equals("thursday")) {
            System.out.println("4 день недели");
        } else if (day.equals("friday")) {
            System.out.println("5 день недели");
        } else if (day.equals("saturday")) {
            System.out.println("6 день недели");
        } else if (day.equals("sunday")) {
            System.out.println("7 день недели");
        } else {
            System.out.println("такого дня нет");
        }

        // использование оператора switch
        switch (day) {
            case "monday":
                System.out.println("1 день недели");
                break;
            case "tuesday":
                System.out.println("2 день недели");
                break;
            case "wednesday":
                System.out.println("3 день недели");
                break;
            case "thursday":
                System.out.println("4 день недели");
                break;
            case "friday":
                System.out.println("5 день недели (скоро выходной)");
                break;
            case "saturday":
                System.out.println("6 день недели (еее выходной))))");
                break;
            case "sunday":
                System.out.println("7 день недели (еее выходной,жаль крайний)");
                break;
            default:
                System.out.println("такого дня нет");
        }

        in.close();
    }
}
