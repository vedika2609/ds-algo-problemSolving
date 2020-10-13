package dsalgo.datastructures.linkedlist.singlylinkedlist;

public class MiddleOfALinkedList {
    private Node head;

    public static void main(String[] args) {
        MiddleOfALinkedList linkedList = new MiddleOfALinkedList();
        linkedList.head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        linkedList.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(linkedList.getMiddle());

    }

    private int getMiddle() {
        Node slowPtr = head;
        Node fastPtr = head;

        if (head == null)
            return -1;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;
    }
}
