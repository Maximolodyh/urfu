package ExamplesPlusTasksLab10;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class NewHtmlParser {
    public static void main(String[] args) {
        String url = "https://e1.ru";
        Document doc = null;
        int retries = 3;
        // 1. Попытки подключения (Retry)
        while (retries > 0) {
            try {
                System.out.println("Подключаемся к " + url + "...");
                doc = Jsoup.connect(url)
                        .userAgent("Mozilla/5.0") // Минимум для прохода
                        .timeout(10000)
                        .get();
                break;
            } catch (IOException e) {
                retries--;
                System.out.println("Ошибка. Осталось попыток: " + retries);
                if (retries == 0) return;
            }
        }
        // 2. Парсинг и запись в файл
        try (FileWriter writer = new FileWriter("parsed_news.txt", false)) {
            // На Регнуме новости лежат в блоках с классом 'news-link'
            Elements newsItems = doc.select(".news-link");

            if (newsItems.isEmpty()) {
                // Если классы поменяли, берем просто все ссылки из основного контейнера
                newsItems = doc.select("article a");
            }
            int count = 0;
            for (Element item : newsItems) {
                if (count >= 10) break;
                String title = item.text().trim();
                // Ищем время рядом с ссылкой (обычно в теге span или time)
                String time = item.parent().select("time, .m-date").text();
                if (!title.isEmpty() && title.length() > 10) {
                    String result = "Новость: " + title + "\nВремя: " + time + "\n\n";

                    System.out.print(result);
                    writer.write(result);
                    count++;
                }
            }
            writer.flush();
            System.out.println("Готово! Записано новостей: " + count);
            System.out.println("Проверь файл в корне проекта.");

        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }
}



