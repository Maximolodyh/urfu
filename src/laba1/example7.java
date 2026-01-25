package laba1;
//task2
import java.util.Scanner;

public class example7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = in.nextLine();

        System.out.print("Enter age: ");
        int age = in.nextInt();

        System.out.println("Hello " + name + ", Your age: " + age);

        in.close();
    }
}
