package lab09.task5.head;

/**
 * Задание 5 (способ 1). Создание однонаправленного списка с головы.
 */
public class Node {
    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
