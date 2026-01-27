package lab7;

class Level1 {
    public int a;

    public Level1(int a) {
        this.a = a;
    }

    public void set(int a) {
        this.a = a;
    }

    public String toString() {
        return "Level1: a=" + a;
    }
}

class Level2 extends Level1 {
    public char b;

    public Level2(int a, char b) {
        super(a);
        this.b = b;
    }

    public void set(int a, char b) {
        set(a);
        this.b = b;
    }

    public String toString() {
        return "Level2: a=" + a + ", b=" + b;
    }
}

class Level3 extends Level2 {
    public String c;

    public Level3(int a, char b, String c) {
        super(a, b);
        this.c = c;
    }

    public void set(int a, char b, String c) {
        set(a, b);
        this.c = c;
    }

    public String toString() {
        return "Level3: a=" + a + ", b=" + b + ", c=" + c;
    }
}

public class example3 {
    public static void main(String[] args) {
        System.out.println(new Level3(5, 'X', "Text"));
    }
}