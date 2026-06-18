package lab09.task8;

import java.util.Scanner;

/**
 * Демонстрация работы односвязного списка (задание 8).
 */
public class LinkedListApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("=== Ввод с хвоста (цикл) ===");
        System.out.print("Количество элементов: ");
        int count = scanner.nextInt();
        System.out.println("Введите элементы:");
        list.createTail(scanner, count);
        System.out.println("Список: " + list.toString());

        System.out.println("\n=== addFirst(0), addLast(99) ===");
        list.addFirst(0);
        list.addLast(99);
        System.out.println("Список: " + list.toString());

        System.out.println("\n=== insert(3, 44) ===");
        list.insert(3, 44);
        System.out.println("Список: " + list.toString());

        System.out.println("\n=== removeFirst(), removeLast() ===");
        list.removeFirst();
        list.removeLast();
        System.out.println("Список: " + list.toString());

        System.out.println("\n=== remove(2) ===");
        list.remove(2);
        System.out.println("Список: " + list.toString());

        System.out.println("\n=== Рекурсивный вывод toStringRec() ===");
        System.out.println("Список: " + list.toStringRec());

        System.out.println("\n=== Ввод с головы (рекурсия) ===");
        SinglyLinkedList listRec = new SinglyLinkedList();
        System.out.print("Количество элементов: ");
        int countRec = scanner.nextInt();
        System.out.println("Введите элементы:");
        listRec.createHeadRec(scanner, countRec);
        System.out.println("Список: " + listRec.toStringRec());

        scanner.close();
    }
}
