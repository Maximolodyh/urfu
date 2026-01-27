package lab7;

class BaseText {
    private String text;

    public BaseText(String text) {
        this.text = text;
    }

    public void setValue(String text) {
        this.text = text;
    }

    public int length() {
        return text.length();
    }

    @Override
    public String toString() {
        return "BaseText: text=" + text;
    }
}

class ExtendedText extends BaseText {
    public int number;

    public ExtendedText(int number, String text) {
        super(text);
        this.number = number;
    }

    public void setValue() {
        setValue("");
        number = 0;
    }

    public void setValue(String text) {
        super.setValue(text);
    }

    public void setValue(int number) {
        this.number = number;
    }

    public void setValue(String text, int number) {
        setValue(text);
        this.number = number;
    }

    @Override
    public String toString() {
        return "ExtendedText: " + super.toString() + ", number=" + number;
    }
}

public class example2 {
    public static void main(String[] args) {
        ExtendedText obj = new ExtendedText(10, "Java");
        obj.setValue("Hello", 25);
        System.out.println(obj);
    }
}