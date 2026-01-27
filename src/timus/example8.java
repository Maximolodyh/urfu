package timus;

import java.util.Scanner;

public class example8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Timus 2100.\nEnter number of guests: ");
        int n = in.nextInt();
        in.nextLine();

        int guests = 2; // жених и невеста

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            if (name.endsWith("+one")) {
                guests += 2;
            } else {
                guests += 1;
            }
        }

        if (guests == 13) {
            guests++;
        }

        System.out.println("Dinner cost: " + (guests * 100));

        in.close();
    }
}
