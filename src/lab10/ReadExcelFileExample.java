package ExamplesPlusTasksLab10;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "example3.xlsx";
        boolean success = false;

        while (!success) {
            try (FileInputStream inputStream = new FileInputStream(filePath);
                 Workbook workbook = new XSSFWorkbook(inputStream)) {
                Sheet sheet = workbook.getSheet("Товары");

                // Проверка на наличие листа
                if (sheet == null) {
                    throw new IllegalArgumentException("Лист с названием 'Товары' не найден в файле!");
                }
                System.out.println("--- Данные из файла ---");
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t | ");
                    }
                    System.out.println();
                }
                success = true;
            } catch (FileNotFoundException e) {
                System.err.println("ОШИБКА: Файл '" + filePath + "' не найден.");
                System.out.println("Совет: Проверьте, что файл лежит в корне папки проекта.");
                if (!askRetry(scanner)) break;
            } catch (org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException e) {
                System.err.println("ОШИБКА: Неверный формат файла.");
                System.out.println("Совет: Файл должен иметь расширение .xlsx и быть корректным Excel-файлом.");
                if (!askRetry(scanner)) break;
            } catch (IllegalArgumentException e) {
                System.err.println("ОШИБКА: " + e.getMessage());
                System.out.println("Совет: Убедитесь, что лист называется именно 'Товары' (регистр важен).");
                if (!askRetry(scanner)) break;
            } catch (IOException e) {
                System.err.println("ОШИБКА ДОСТУПА: Возможно, файл открыт в другой программе.");
                System.out.println("Совет: Закройте Excel и попробуйте снова.");
                if (!askRetry(scanner)) break;
            } catch (Exception e) {
                System.err.println("ПРОИЗОШЛА НЕПРЕДВИДЕННАЯ ОШИБКА: " + e.getMessage());
                break;
            }
        }
    }

    private static boolean askRetry(Scanner scanner) {
        System.out.println("\nИсправьте ошибку и нажмите Enter, чтобы попробовать снова, или введите 'exit' для выхода:");
        String input = scanner.nextLine();
        return !input.equalsIgnoreCase("exit");
    }
}
