package linkedlist;

public class LinkedList {
    Node head;

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void addToEnd(Node newNode) {

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void addAfterNode(Node nodeAfter, Node newNode) {

    }

    public void deleteNode(int val) {
        Node current = head;

        while (current != null && current.next != null && current.next.val != val) {
            current = current.next;
        }

        if (current != null && current.next != null) {
            current.next = current.next.next;
        }
    }

    public void searchNode(int val) {

    }


    public void reverseLinkedList() {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        head = prev;
    }
}


class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}