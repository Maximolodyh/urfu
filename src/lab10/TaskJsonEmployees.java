package ExamplesPlusTasksLab10;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class TaskJsonEmployees {
    private static final String FILE_PATH = "src/Examples10/employees.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        while (true) {
            System.out.println("\n--- Меню управления сотрудниками ---");
            System.out.println("1 - Показать всех");
            System.out.println("2 - Поиск по должности");
            System.out.println("3 - Добавить сотрудника");
            System.out.println("4 - Удалить по имени");
            System.out.println("0 - Выход");
            System.out.print("Выбор: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> displayAll();
                case "2" -> {
                    System.out.print("Введите должность для поиска: ");
                    searchByPosition(scanner.nextLine());
                }
                case "3" -> {
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите должность: ");
                    String pos = scanner.nextLine();
                    System.out.print("Введите зарплату: ");
                    long salary = Long.parseLong(scanner.nextLine());
                    addEmployee(name, pos, salary);
                }
                case "4" -> {
                    System.out.print("Введите имя сотрудника для удаления: ");
                    removeEmployee(scanner.nextLine());
                }
                case "0" -> System.exit(0);
                default -> System.out.println("Неверный ввод.");
            }
        }
    }

    // Вывод всех данных
    private static void displayAll() {
        try {
            JSONParser parser = new JSONParser();
            JSONObject root = (JSONObject) parser.parse(new FileReader(FILE_PATH));
            JSONArray employees = (JSONArray) root.get("employees");

            for (Object o : employees) {
                JSONObject emp = (JSONObject) o;
                System.out.println("Сотрудник: " + emp.get("name") +
                        " | Должность: " + emp.get("position") +
                        " | Зарплата: " + emp.get("salary"));
            }
        } catch (Exception e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
    }

    // Задание 2: Поиск по должности (Замена поиска по автору)
    private static void searchByPosition(String position) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject root = (JSONObject) parser.parse(new FileReader(FILE_PATH));
            JSONArray employees = (JSONArray) root.get("employees");

            boolean found = false;
            for (Object o : employees) {
                JSONObject emp = (JSONObject) o;
                // Явное приведение к String для сравнения
                String currentPos = (String) emp.get("position");
                if (currentPos != null && currentPos.equalsIgnoreCase(position)) {
                    System.out.println("Найден сотрудник: " + emp.get("name"));
                    found = true;
                }
            }
            if (!found) System.out.println("Сотрудники с такой должностью не найдены.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Задание 3: Добавление (Замена добавления книги)
    private static void addEmployee(String name, String position, long salary) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject root = (JSONObject) parser.parse(new FileReader(FILE_PATH));
            JSONArray employees = (JSONArray) root.get("employees");

            JSONObject newEmp = new JSONObject();
            newEmp.put("name", name);
            newEmp.put("position", position);
            newEmp.put("salary", salary);
            employees.add(newEmp);

            saveToFile(root);
            System.out.println("Сотрудник " + name + " успешно добавлен.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Задание 4: Удаление по имени (Замена удаления по названию)
    private static void removeEmployee(String name) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject root = (JSONObject) parser.parse(new FileReader(FILE_PATH));
            JSONArray employees = (JSONArray) root.get("employees");

            Iterator iterator = employees.iterator();
            boolean removed = false;
            while (iterator.hasNext()) {
                JSONObject emp = (JSONObject) iterator.next();
                if (emp.get("name").toString().equals(name)) {
                    iterator.remove();
                    removed = true;
                }
            }

            if (removed) {
                saveToFile(root);
                System.out.println("Сотрудник " + name + " удален.");
            } else {
                System.out.println("Сотрудник не найден.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Вспомогательный метод для сохранения
    private static void saveToFile(JSONObject root) {
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            file.write(root.toJSONString());
            file.flush();
        } catch (Exception e) {
            System.out.println("Ошибка сохранения: " + e.getMessage());
        }
    }
}
