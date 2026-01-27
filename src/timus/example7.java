package timus;

import java.util.Scanner;

public class example7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Timus 1567.\nEnter text: ");
        String text = in.nextLine();

        int cost = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if ("abc".indexOf(c) >= 0) cost += 1;
            else if ("def".indexOf(c) >= 0) cost += 2;
            else if ("ghi".indexOf(c) >= 0) cost += 3;
            else if ("jkl".indexOf(c) >= 0) cost += 1;
            else if ("mno".indexOf(c) >= 0) cost += 2;
            else if ("pqrs".indexOf(c) >= 0) cost += 3;
            else if ("tuv".indexOf(c) >= 0) cost += 1;
            else if ("wxyz".indexOf(c) >= 0) cost += 2;
            else if (c == ' ') cost += 1;
        }

        System.out.println("SMS cost: " + cost);
    }
}
