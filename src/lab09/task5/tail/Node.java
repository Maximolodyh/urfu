package lab09.task5.tail;

/**
 * Задание 5 (способ 2). Создание однонаправленного списка с хвоста.
 */
public class Node {
    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
