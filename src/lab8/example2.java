package lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class example2 {

        public static void main(String[] args) {

            String inputFile = "input.txt";
            String outputFile = "output.txt";

            BufferedReader br = null;
            BufferedWriter bw = null;

            try {
                br = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(inputFile), "UTF-8"));

                bw = new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream(outputFile), "UTF-8"));

                String line;
                int lineNumber = 0;

                // Чтение строк
                while ((line = br.readLine()) != null) {
                    lineNumber++;

                    // Переписать вторую строку
                    if (lineNumber == 2) {
                        bw.write(line);
                        bw.newLine();
                    }

                    // Проверка чисел
                    try {
                        double value = Double.parseDouble(line);
                        if (value > 0) {
                            bw.write(Double.toString(value));
                            bw.newLine();
                        }
                    } catch (NumberFormatException e) {
                        // строка не число — игнорируем
                    }
                }

            } catch (IOException e) {
                System.out.println("Ошибка: " + e);
            } finally {
                try {
                    if (br != null) br.close();
                    if (bw != null) {
                        bw.flush();
                        bw.close();
                    }
                } catch (IOException e) {
                    // игнор
                }
            }
        }
    }