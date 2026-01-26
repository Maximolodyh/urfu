package lab4;

public class example1 {

    public static void main(String[] args) {
        int width = 23;   // ширина (колонки)
        int height = 11;  // высота (строки)

        for (int h = 1; h <= height; h++) {
            for (int w = 1; w <= width * 2; w++) {

                // Верхняя и нижняя границы
                if (h == 1 || h == height) {
                    if (w < width) {
                        System.out.print(" —");
                    }
                }
                // Левая и правая границы
                else if (w == 1 || w == width * 2) {
                    System.out.print("|");
                }
                // Внутри прямоугольника
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
