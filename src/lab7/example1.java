package lab7;

class SuperText {
    private String text;

    public SuperText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SuperText: text=" + text;
    }
}

class SubText extends SuperText {
    private String extraText;

    public SubText(String text) {
        super(text);
        this.extraText = "";
    }

    public SubText(String text, String extraText) {
        super(text);
        this.extraText = extraText;
    }

    @Override
    public String toString() {
        return "SubText: " + super.toString() + ", extraText=" + extraText;
    }
}

public class example1 {
    public static void main(String[] args) {
        System.out.println(new SuperText("Hello"));
        System.out.println(new SubText("Hello", "World"));
    }
}

