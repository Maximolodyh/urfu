package lab6;

public class example9 {
    // статический метод, меняющий элементы массива попарно
    public static void reverse(char[] array) {

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    // для проверки
    public static void main(String[] args) {

        char[] data = {'a', 'b', 'c', 'd', 'e'};

        reverse(data);

        for (char c : data) {
            System.out.print(c + " ");
        }
    }
}
