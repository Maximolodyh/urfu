package lab6;

public class example8 {

    // статический метод вычисления среднего значения массива
    public static double average(int[] array) {

        if (array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int x : array) {
            sum += x;
        }

        return (double) sum / array.length;
    }

    // для проверки
    public static void main(String[] args) {

        int[] data = {2, 4, 6, 8};

        double avg = average(data);
        System.out.println("Average value: " + avg);
    }
}
