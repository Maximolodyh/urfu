package lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class example3 {
        // Русские согласные буквы
        private static final String CONSONANTS =
                "бвгджзйклмнпрстфхцчшщ";  // согласные буквы

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

                while ((line = br.readLine()) != null) {
                    lineNumber++;

                    String[] words = line.split("[\\s,.;:!?()\"—]+");
                    int count = 0;

                    StringBuilder result = new StringBuilder();

                    for (String word : words) {
                        if (word.isEmpty()) continue;

                        char firstChar = Character.toLowerCase(word.charAt(0));
                        if (CONSONANTS.indexOf(firstChar) != -1) {
                            result.append(word).append(" ");
                            count++;
                        }
                    }

                    bw.write("Строка " + lineNumber + ": ");
                    if (count > 0) {
                        bw.write(result.toString().trim());
                    } else {
                        bw.write("нет слов");
                    }
                    bw.newLine();
                    bw.write("Количество слов: " + count);
                    bw.newLine();
                    bw.newLine();
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
                }
            }
        }
    }