package lab5;

public class example4 {
    private char symbol;
    private int number;

    // конструктор с двумя аргументами
    public example4(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
    }

    // конструктор с одним аргументом типа double
    public example4(double value) {
        int intPart = (int) value;              // целая часть
        int fracPart = (int) ((value - intPart) * 100); // десятые и сотые

        this.symbol = (char) intPart;
        this.number = fracPart;
    }

    // для проверки
    public static void main(String[] args) {

        example4 obj1 = new example4(20, 'f');
        System.out.println("Symbol: " + obj1.symbol + ", Number: " + obj1.number);

        example4 obj2 = new example4(65.1267);
        System.out.println("Symbol: " + obj2.symbol + ", Number: " + obj2.number);
    }
}
