package lab7;

class Parent {
    private String text;

    public Parent(String text) {
        this.text = text;
    }

    public void show() {
        System.out.println("Parent: text=" + text);
    }

    protected String getText() {
        return text;
    }
}

class ChildInt extends Parent {
    protected int number;

    public ChildInt(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void show() {
        System.out.println("ChildInt: text=" + getText() + ", number=" + number);
    }
}

class ChildChar extends Parent {
    protected char symbol;

    public ChildChar(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        System.out.println("ChildChar: text=" + getText() + ", symbol=" + symbol);
    }
}

public class example5 {
    public static void main(String[] args) {
        Parent p1 = new ChildInt("Data", 5);
        Parent p2 = new ChildChar("Data", 'Z');

        p1.show();
        p2.show();
    }
}