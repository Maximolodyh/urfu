package ExamplesPlusTasksLab10;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcelFile {
    public static void main(String[] args) {
        String filePath = "example3.xlsx";
        try (XSSFWorkbook workbook = new XSSFWorkbook()) {
            XSSFSheet sheet = workbook.createSheet("Товары");

            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("Товар");
            header.createCell(1).setCellValue("Характеристики");
            header.createCell(2).setCellValue("Цена");

            Row data = sheet.createRow(1);
            data.createCell(0).setCellValue("Процессор");
            data.createCell(1).setCellValue("Intel i5, 8GB RAM");
            data.createCell(2).setCellValue(25000.0);

            try (FileOutputStream out = new FileOutputStream(filePath)) {
                workbook.write(out);
                System.out.println("Файл успешно создан: " + filePath);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
}
