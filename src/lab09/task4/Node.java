package lab09.task4;

/**
 * Задание 4. Пример 6 из раздела 2 — однонаправленный список из независимых узлов.
 */
public class Node {
    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
