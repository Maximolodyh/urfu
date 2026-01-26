package progect1;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number % 5 == 2 && number % 7 == 1) {
            System.out.println("число удовлетворяет условиям деления на 5 и 7");
        } else {
            System.out.println("число не удовлетворяет условиям деления на 5 и 7");
        }

        in.close();
	}

}
