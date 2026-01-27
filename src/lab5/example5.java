package lab5;

public class example5 {
    private int value; // закрытое целочисленное поле

    // конструктор без аргументов
    public example5() {
        this.value = 0;
    }

    // конструктор с целочисленным аргументом
    public example5(int value) {
        setValue(value);
    }

    // метод без аргументов — присваивает 0
    public void setValue() {
        this.value = 0;
    }

    // метод с аргументом — присваивает значение, но не больше 100
    public void setValue(int value) {
        if (value > 100) {
            this.value = 100;
        } else {
            this.value = value;
        }
    }

    // метод для проверки значения поля
    public int getValue() {
        return value;
    }

    // для проверки
    public static void main(String[] args) {

        example5 obj1 = new example5();
        System.out.println(obj1.getValue());

        example5 obj2 = new example5(50);
        System.out.println(obj2.getValue());

        example5 obj3 = new example5(150);
        System.out.println(obj3.getValue());

        obj3.setValue();
        System.out.println(obj3.getValue());
    }
}
