package lab6;

public class example7 {

    // статический метод: из char[] делает int[] с кодами символов
    public static int[] charCodes(char[] chars) {

        int[] codes = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            codes[i] = (int) chars[i];
        }

        return codes;
    }

    // для проверки
    public static void main(String[] args) {

        char[] symbols = {'A', 'b', '3', '?'};

        int[] result = charCodes(symbols);

        for (int code : result) {
            System.out.print(code + " ");
        }
    }
}
