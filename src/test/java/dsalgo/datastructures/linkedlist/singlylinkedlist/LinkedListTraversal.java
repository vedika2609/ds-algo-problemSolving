package dsalgo.datastructures.linkedlist.singlylinkedlist;

class LinkedListTraversal {
    private Node head;

    public static void main(String[] args) {
        LinkedListTraversal linkedListTraversal = new LinkedListTraversal();
        linkedListTraversal.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedListTraversal.head.next = second;
        second.next = third;

        linkedListTraversal.printList();
    }

    private void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
