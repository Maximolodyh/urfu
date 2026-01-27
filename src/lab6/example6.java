package lab6;

public class example6 {

    // статический метод
    public static int[] getSubArray(int[] source, int count) {

        if (count >= source.length) {
            // если нужно взять больше, чем есть — копия всего массива
            int[] copy = new int[source.length];
            for (int i = 0; i < source.length; i++) {
                copy[i] = source[i];
            }
            return copy;
        }

        // новый массив из первых count элементов
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = source[i];
        }

        return result;
    }

    // для проверки
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] a1 = getSubArray(array, 3);
        int[] a2 = getSubArray(array, 10);

        System.out.print("первые 3 элемента: ");
        for (int x : a1) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("копия массива: ");
        for (int x : a2) {
            System.out.print(x + " ");
        }
    }
}
