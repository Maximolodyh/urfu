package lab13.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success = false;

        try {
            System.out.println("=== Вывод столбца матрицы ===");

            System.out.print("Введите количество строк: ");
            int rows = readInt(scanner);

            System.out.print("Введите количество столбцов: ");
            int cols = readInt(scanner);

            if (rows <= 0 || cols <= 0) {
                throw new IllegalArgumentException("Размеры матрицы должны быть положительными.");
            }

            int[][] matrix = new int[rows][cols];
            System.out.println("Введите элементы матрицы (" + rows + "x" + cols + "):");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("a[" + i + "][" + j + "] = ");
                    matrix[i][j] = readInt(scanner);
                }
            }

            System.out.print("Введите номер столбца (от 1 до " + cols + "): ");
            int columnNumber = readInt(scanner);

            printColumn(matrix, columnNumber, cols);
            success = true;

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа. Ожидается целое число.");
            System.out.println("Класс исключения: " + e.getClass().getName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: столбца с таким номером не существует.");
            System.out.println("Класс исключения: " + e.getClass().getName());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            if (success) {
                System.out.println("Программа выполнена успешно.");
            } else {
                System.out.println("Программа завершена с обработкой исключительной ситуации.");
            }
        }
    }

    private static int readInt(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            String wrongInput = scanner.next();
            throw new InputMismatchException("Ожидалось число, получено: " + wrongInput);
        }
        return scanner.nextInt();
    }

    private static void printColumn(int[][] matrix, int columnNumber, int cols) {
        int columnIndex = columnNumber - 1;

        if (columnIndex < 0 || columnIndex >= cols) {
            throw new ArrayIndexOutOfBoundsException(columnNumber);
        }

        System.out.println("Столбец №" + columnNumber + ":");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][columnIndex]);
        }
    }
}
