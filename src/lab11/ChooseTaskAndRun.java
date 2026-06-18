package TasksAllInOne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class ChooseTaskAndRun {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in, "UTF-8");

            while (true) {
                System.out.println("\nВыберите задачу (1-10) или 0 для выхода:");
                int task = Integer.parseInt(sc.nextLine());
                if (task == 0) break;

                System.out.println("Введите элементы через ПРОБЕЛ:");
                String input = sc.nextLine();
                List<String> rawList = Arrays.asList(input.split("\\s+"));

                switch (task) {
                    case 1 -> { // Четные
                        List<Integer> res = rawList.stream().map(Integer::parseInt)
                                .filter(n -> n % 2 == 0).collect(Collectors.toList());
                        System.out.println("Результат: " + res);
                    }
                    case 2 -> { // Пересечение двух массивов
                        System.out.println("Введите второй массив через пробел:");
                        List<String> list2 = Arrays.asList(sc.nextLine().split("\\s+"));
                        List<String> res = rawList.stream().filter(list2::contains)
                                .distinct().collect(Collectors.toList());
                        System.out.println("Общие элементы: " + res);
                    }
                    case 3 -> { // С большой буквы
                        List<String> res = rawList.stream()
                                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                                .collect(Collectors.toList());
                        System.out.println("Результат: " + res);
                    }
                    case 4 -> { // Квадраты
                        List<Integer> res = rawList.stream().map(Integer::parseInt)
                                .map(n -> n * n).collect(Collectors.toList());
                        System.out.println("Результат: " + res);
                    }
                    case 5 -> { // Содержит подстроку
                        System.out.print("Введите подстроку: ");
                        String sub = sc.nextLine();
                        List<String> res = rawList.stream().filter(s -> s.contains(sub)).collect(Collectors.toList());
                        System.out.println("Результат: " + res);
                    }
                    case 6 -> { // Делятся на число
                        System.out.print("Введите делитель: ");
                        int div = Integer.parseInt(sc.nextLine());
                        List<Integer> res = rawList.stream().map(Integer::parseInt)
                                .filter(n -> n % div == 0).collect(Collectors.toList());
                        System.out.println("Результат: " + res);
                    }
                    case 7 -> { // Длина больше заданного
                        System.out.print("Введите мин. длину: ");
                        int len = Integer.parseInt(sc.nextLine());
                        List<String> res = rawList.stream().filter(s -> s.length() > len).collect(Collectors.toList());
                        System.out.println("Результат: " + res);
                    }
                    case 8 -> { // Больше значения
                        System.out.print("Введите порог: ");
                        int val = Integer.parseInt(sc.nextLine());
                        List<Integer> res = rawList.stream().map(Integer::parseInt)
                                .filter(n -> n > val).collect(Collectors.toList());
                        System.out.println("Результат: " + res);
                    }
                    case 9 -> { // Только буквы
                        List<String> res = rawList.stream()
                                .filter(s -> s.matches("^[a-zA-Zа-яА-Я]+$")).collect(Collectors.toList());
                        System.out.println("Результат: " + res);
                    }
                    case 10 -> { // Меньше значения
                        System.out.print("Введите порог: ");
                        int val = Integer.parseInt(sc.nextLine());
                        List<Integer> res = rawList.stream().map(Integer::parseInt)
                                .filter(n -> n < val).collect(Collectors.toList());
                        System.out.println("Результат: " + res);
                    }
                    default -> System.out.println("Нет такой задачи.");
                }
            }
        }
}
