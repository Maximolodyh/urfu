package progect1;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number % 4 == 0 && number >= 10) {
            System.out.println("число делится на 4)");
        } else {
            System.out.println("число не делится на 4(");
        }

        in.close();
	}

}
