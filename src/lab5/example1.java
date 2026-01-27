package lab5;

public class example1 {
    private char symbol; // закрытое символьное поле

    // метод присваивает значение полю
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    // метод возвращает код символа
    public int getSymbolCode() {
        return (int) symbol;
    }

    // метод выводит символ и его код
    public void printSymbolAndCode() {
        System.out.println("Символ: " + symbol);
        System.out.println("Код символа: " + (int) symbol);
    }

    // для проверки работы
    public static void main(String[] args) {
        example1 obj = new example1();
        obj.setSymbol('M');
        obj.printSymbolAndCode();
    }
}
