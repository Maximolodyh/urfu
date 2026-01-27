package lab6;

public class example5 {

    // статический метод вычисления суммы квадратов
    public static long sumOfSquares(int n) {

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (long) i * i;
        }

        return sum;
    }

    // для проверки
    public static void main(String[] args) {

        int n = 10;

        long result = sumOfSquares(n);
        System.out.println("сумма квадратов чисел от 1 до " + n + " = " + result);

        // проверка по формуле n(n+1)(2n+1)/6
        long formula = (long) n * (n + 1) * (2L * n + 1) / 6;
        System.out.println("результат формулы = " + formula);
    }
}
