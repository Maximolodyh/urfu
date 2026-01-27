package lab6;

public class example1 {
    private char ch;        // символьное поле
    private String text;    // текстовое поле

    // метод с символьным аргументом
    public void setValue(char ch) {
        this.ch = ch;
    }

    // метод с текстовым аргументом
    public void setValue(String text) {
        this.text = text;
    }

    // метод с символьным массивом
    public void setValue(char[] array) {
        if (array.length == 1) {
            this.ch = array[0];
        } else {
            this.text = new String(array);
        }
    }

    // метод для проверки значений полей
    public void printValues() {
        System.out.println("Symbol field: " + ch);
        System.out.println("Text field: " + text);
    }

    // для проверки
    public static void main(String[] args) {

        example1 obj = new example1();

        obj.setValue('A');
        obj.printValues();

        obj.setValue("Hello");
        obj.printValues();

        char[] arr1 = {'Z'};
        obj.setValue(arr1);
        obj.printValues();

        char[] arr2 = {'J', 'a', 'v', 'a'};
        obj.setValue(arr2);
        obj.printValues();
    }
}
