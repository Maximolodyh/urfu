package lab6;

public class example3 {
    // наибольшее значение (произвольное количество аргументов)
    public static int max(int... values) {
        int max = values[0];
        for (int v : values) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    // наименьшее значение (произвольное количество аргументов)
    public static int min(int... values) {
        int min = values[0];
        for (int v : values) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    // среднее значение (произвольное количество аргументов)
    public static double average(int... values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length;
    }

    // версии методов для массива
    public static int maxFromArray(int[] array) {
        return max(array);
    }

    public static int minFromArray(int[] array) {
        return min(array);
    }

    public static double averageFromArray(int[] array) {
        return average(array);
    }

    // для проверки
    public static void main(String[] args) {

        int[] data = {3, 7, 2, 9, 5};

        System.out.println("Max: " + max(3, 7, 2, 9, 5));
        System.out.println("Min: " + min(3, 7, 2, 9, 5));
        System.out.println("Average: " + average(3, 7, 2, 9, 5));

        System.out.println("Max (array): " + maxFromArray(data));
        System.out.println("Min (array): " + minFromArray(data));
        System.out.println("Average (array): " + averageFromArray(data));
    }
}

