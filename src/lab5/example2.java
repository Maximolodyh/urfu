package lab5;

public class example2 {

    private char first;
    private char second;

    // метод для задания значений полей
    public void setChars(char first, char second) {
        this.first = first;
        this.second = second;
    }

    // метод без аргументов, выводит символы между first и second
    public void printCharsBetween() {
        char start = first < second ? first : second;
        char end = first < second ? second : first;

        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // для проверки
    public static void main(String[] args) {
        example2 obj = new example2();
        obj.setChars('C','K');
        obj.printCharsBetween();
    }
}

