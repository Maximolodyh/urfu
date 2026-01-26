package progect1;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (number >= 5 && number <= 10) {
            System.out.println("Число входит в промежуток от 5 до 10)");
        } else {
            System.out.println("Число не входит в промежуток от 5 до 10(");
        }

        in.close();
	}

}
