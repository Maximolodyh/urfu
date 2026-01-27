package lab5;

public class example3 {
    private int a;
    private int b;

    // конструктор без аргументов
    public example3() {
        this.a = 0;
        this.b = 0;
    }

    // конструктор с одним аргументом
    public example3(int a) {
        this.a = a;
        this.b = 0;
    }

    // конструктор с двумя аргументами
    public example3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // для проверки
    public static void main(String[] args) {
        example3 obj1 = new example3();
        example3 obj2 = new example3(5);
        example3 obj3 = new example3(3, 7);

        System.out.println("obj1: a=" + obj1.a + ", b=" + obj1.b);
        System.out.println("obj2: a=" + obj2.a + ", b=" + obj2.b);
        System.out.println("obj3: a=" + obj3.a + ", b=" + obj3.b);
    }
}

