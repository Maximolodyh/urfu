package lab6;

public class example10 {
    public static int[] findMaxAndMin(int... values) {

        int max = values[0];
        int min = values[0];

        for (int v : values) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }

        return new int[]{max, min};
    }

    // для проверки
    public static void main(String[] args) {

        int[] result = findMaxAndMin(5, 2, 9, 1, 7);

        System.out.println("Max = " + result[0]);
        System.out.println("Min = " + result[1]);
    }
}
