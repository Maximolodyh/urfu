package timus;
import java.util.Scanner;
public class example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Timus 1264\n");
        System.out.print("Enter lines: ");
        int n = in.nextInt();
        System.out.print("Enter days: ");
        int m = in.nextInt();
        System.out.println("Result: " + (n * (m + 1)));
        in.close();
    }
}
