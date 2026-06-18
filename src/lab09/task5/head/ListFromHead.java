package lab09.task5.head;

/**
 * Задание 5 (способ 1). Построение списка от головы к хвосту.
 */
public class ListFromHead {

    public static void main(String[] args) {
        Node head = null;

        for (int i = 5; i >= 1; i--) {
            head = new Node(i, head);
        }

        System.out.println("Список, созданный с головы:");
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
