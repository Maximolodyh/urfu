package lab6;

public class example4 {
    // статический метод вычисления двойного факториала
    public static long doubleFactorial(int n) {

        long result = 1;

        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }

        return result;
    }

    // для проверки
    public static void main(String[] args) {

        System.out.println("6!! = " + doubleFactorial(6)); // 48
        System.out.println("5!! = " + doubleFactorial(5)); // 15
        System.out.println("8!! = " + doubleFactorial(8)); // 384
        System.out.println("7!! = " + doubleFactorial(7)); // 105
    }
}
