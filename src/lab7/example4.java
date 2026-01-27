package lab7;

class A {
    public char ch;

    public A(char ch) {
        this.ch = ch;
    }

    public A(A other) {
        this.ch = other.ch;
    }
}

class B extends A {
    public String text;

    public B(char ch, String text) {
        super(ch);
        this.text = text;
    }

    public B(B other) {
        super(other);
        this.text = other.text;
    }
}

class C extends B {
    public int num;

    public C(char ch, String text, int num) {
        super(ch, text);
        this.num = num;
    }

    public C(C other) {
        super(other);
        this.num = other.num;
    }
}

public class example4 {
    public static void main(String[] args) {
        C obj1 = new C('A', "Hello", 10);
        C obj2 = new C(obj1);
        System.out.println(obj2.ch + " " + obj2.text + " " + obj2.num);
    }
}