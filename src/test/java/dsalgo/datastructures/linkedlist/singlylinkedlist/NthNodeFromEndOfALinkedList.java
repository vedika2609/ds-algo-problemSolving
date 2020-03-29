package dsalgo.datastructures.linkedlist.singlylinkedlist;

//O(n)

public class NthNodeFromEndOfALinkedList {
    private Node head;

    public static void main(String[] args) {
        NthNodeFromEndOfALinkedList linkedList = new NthNodeFromEndOfALinkedList();
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

        System.out.println(linkedList.getNthNodeFromEndOfLL(2));

    }

    private int getNthNodeFromEndOfLL(int x) {
        int length = 0;
        int i = 1;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        temp = head;
        if (length < x)
            return -1;

        while (i < length - x + 1) {
            temp = temp.next;
            i++;
        }
        return temp.data;
    }
}
