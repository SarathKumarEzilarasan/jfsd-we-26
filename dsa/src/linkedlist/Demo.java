package linkedlist;

public class Demo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToEnd(new Node(10));
        list.addToEnd(new Node(5));
        list.addToEnd(new Node(1));
        list.addToEnd(new Node(11));
        list.addToEnd(new Node(12));
//        list.printList();
//        list.deleteNode(11);
        list.printList();
        list.reverseLinkedList();
        list.printList();

    }



}
