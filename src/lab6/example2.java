package lab6;

public class example2 {
    private static int counter = 0; // закрытое статическое целочисленное поле

    // статический метод
    public static void showAndIncrement() {
        System.out.println("Current value: " + counter);
        counter++;
    }

    // для проверки
    public static void main(String[] args) {

        example2.showAndIncrement();
        example2.showAndIncrement();
        example2.showAndIncrement();
    }
}

