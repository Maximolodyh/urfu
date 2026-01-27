package lab5;

public class example6 {
    public static void main(String[] args) {
        Range r1 = new Range();
        r1.show();

        r1.set(5);
        r1.show();

        r1.set(-3, 10);
        r1.show();

        Range r2 = new Range(7);
        r2.show();

        Range r3 = new Range(12, -2);
        r3.show();

        r3.set(100);
        r3.show();
    }
}

class Range {
    private int min;
    private int max;

    public Range() {
        this.min = 0;
        this.max = 0;
    }

    public Range(int a) {
        this.min = a;
        this.max = a;
    }

    public Range(int a, int b) {
        this.min = Math.min(a, b);
        this.max = Math.max(a, b);
    }

    public void set(int a) {
        int newMin = Math.min(min, a);
        int newMax = Math.max(max, a);
        min = newMin;
        max = newMax;
    }

    public void set(int a, int b) {
        int newMin = Math.min(min, Math.min(a, b));
        int newMax = Math.max(max, Math.max(a, b));
        min = newMin;
        max = newMax;
    }

    public void show() {
        System.out.println("min = " + min + ", max = " + max);
    }
}
