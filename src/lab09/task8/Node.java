package lab09.task8;

/**
 * Узел однонаправленного списка.
 */
public class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
