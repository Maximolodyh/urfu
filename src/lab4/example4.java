package lab4;
// код из второго задания
public class example4 {
    public static void main(String[] args) {
        int height = 10; // высота треугольника

        int width = 2 * height - 1; // ширина основания

        System.out.print("         *           \n"); // если высота будет другая все сломается(

        for (int row = 1; row < height; row++) {
            for (int col = 0; col < width; col++) {

                int left = (height - 1) - row;   // позиция левой стороны
                int right = (height - 1) + row;  // позиция правой стороны

                // Левая грань
                if (col == left) {
                    System.out.print("/");
                }
                // Правая грань
                else if (col == right) {
                    System.out.print("\\");
                }
                // Основание
                else if (row == height - 1 && col > left && col < right) {
                    System.out.print("_");
                }
                // Пустота
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
