package lab09.task4;

/**
 * Задание 4. Построение однонаправленного списка и вывод значений.
 */
public class SinglyLinkedListDemo {

    public static void main(String[] args) {
        Node node3 = new Node(3, null);
        Node node2 = new Node(2, node3);
        Node head = new Node(1, node2);

        System.out.println("Однонаправленный список:");
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
