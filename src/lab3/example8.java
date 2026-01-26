package lab3;

public class example8 {
    public static void main(String[] args) {

    int size = 10;
    char[] array = new char[size];

    char ch = 'A';
    int index = 0;

    while (index < size) {
        // пропускаем гласные буквы которые могут попасться среди 10ти согласных букв
        if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
            array[index] = ch;
            index++;
        }
        ch++;
    }

    System.out.println("Вывод массива:");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}
}
