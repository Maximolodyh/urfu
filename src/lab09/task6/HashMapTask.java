package lab09.task6;

import java.util.HashMap;
import java.util.Map;

/**
 * Задание 6. Работа с HashMap.
 */
public class HashMapTask {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");

        System.out.println("=== Строки с ключом > 5 ===");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        System.out.println("\n=== Строки с ключом = 0 (через запятую) ===");
        StringBuilder zeroKeys = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                if (zeroKeys.length() > 0) {
                    zeroKeys.append(", ");
                }
                zeroKeys.append(entry.getValue());
            }
        }
        System.out.println(zeroKeys);

        System.out.println("\n=== Произведение ключей, где длина строки > 5 ===");
        long product = 1;
        boolean found = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                found = true;
                System.out.println("Ключ " + entry.getKey() + ", строка \"" + entry.getValue() + "\"");
            }
        }
        if (!found) {
            System.out.println("Таких ключей нет, произведение = 0");
        } else {
            System.out.println("Произведение = " + product);
        }
    }
}
