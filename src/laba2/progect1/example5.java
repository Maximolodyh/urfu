package progect1;

import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int thousands = (number / 1000);

        System.out.println("в числе " + thousands + " тысяч");

        in.close();
	}

}
