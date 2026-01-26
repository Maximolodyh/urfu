package lab4;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.print("Введите ключ: ");
        int key = in.nextInt();
        in.nextLine(); // съедаем перевод строки

        String encrypted = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encrypted);

        System.out.print("Выполнить обратное преобразование? (y/n): ");
        String answer = in.nextLine();

        if (answer.equals("y")) {
            String decrypted = encrypt(encrypted, -key);
            System.out.println("Текст после обратного преобразования: " + decrypted);
        } else if (answer.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        in.close();
    }

    // метод шифрования / дешифрования (через кодовую таблицу)
    private static String encrypt(String text, int shift) {
        char[] chars = text.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            result[i] = (char) (chars[i] + shift);
        }

        return new String(result);
    }
}
