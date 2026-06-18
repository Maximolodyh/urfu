package lab09.task8;

import java.util.Scanner;

/**
 * Задание 8. Односвязный линейный список: методы на циклах и рекурсии.
 */
public class SinglyLinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    // --- Методы с использованием цикла ---

    public void createHead(Scanner scanner, int count) {
        head = null;
        for (int i = 0; i < count; i++) {
            int value = scanner.nextInt();
            head = new Node(value, head);
        }
    }

    public void createTail(Scanner scanner, int count) {
        head = null;
        for (int i = 0; i < count; i++) {
            int value = scanner.nextInt();
            if (head == null) {
                head = new Node(value);
            } else {
                Node ref = head;
                while (ref.next != null) {
                    ref = ref.next;
                }
                ref.next = new Node(value);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            sb.append(ref.value);
            if (ref.next != null) {
                sb.append(" -> ");
            }
            ref = ref.next;
        }
        return sb.toString();
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newNode;
    }

    public void insert(int position, int value) {
        if (position <= 1) {
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node ref = head;
        int k = 1;
        while (ref.next != null && k < position - 1) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void remove(int position) {
        if (head == null) {
            return;
        }
        if (position <= 1) {
            removeFirst();
            return;
        }
        Node ref = head;
        int k = 1;
        while (ref.next != null && k < position - 1) {
            ref = ref.next;
            k++;
        }
        if (ref.next != null) {
            ref.next = ref.next.next;
        }
    }

    // --- Методы с использованием рекурсии ---

    public void createHeadRec(Scanner scanner, int count) {
        head = null;
        createHeadRecHelper(scanner, count);
    }

    private void createHeadRecHelper(Scanner scanner, int remaining) {
        if (remaining <= 0) {
            return;
        }
        int value = scanner.nextInt();
        createHeadRecHelper(scanner, remaining - 1);
        head = new Node(value, head);
    }

    public void createTailRec(Scanner scanner, int count) {
        head = createTailRecHelper(scanner, count);
    }

    private Node createTailRecHelper(Scanner scanner, int remaining) {
        if (remaining <= 0) {
            return null;
        }
        int value = scanner.nextInt();
        Node node = new Node(value);
        node.next = createTailRecHelper(scanner, remaining - 1);
        return node;
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node node) {
        if (node == null) {
            return "";
        }
        String rest = toStringRecHelper(node.next);
        if (rest.isEmpty()) {
            return String.valueOf(node.value);
        }
        return node.value + " -> " + rest;
    }
}
