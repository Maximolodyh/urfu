package lab3;

public class example7 {
    public static void main(String[] args) {

        int size = 10;
        char[] array = new char[size];

        char ch = 'a';

        for (int i = 0; i < size; i++) {
            array[i] = ch;
            ch += 2; // через одну букву
        }

        System.out.println("вывод массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.println("вывод перевернутого массива:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
