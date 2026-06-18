package lab09.task5.tail;

/**
 * Задание 5 (способ 2). Построение списка от хвоста к голове.
 */
public class ListFromTail {

    public static void main(String[] args) {
        Node head = new Node(1, null);

        for (int i = 2; i <= 5; i++) {
            head = new Node(i, head);
        }

        System.out.println("Список, созданный с хвоста:");
        printList(head);
    }

    private static void printList(Node head) {
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
