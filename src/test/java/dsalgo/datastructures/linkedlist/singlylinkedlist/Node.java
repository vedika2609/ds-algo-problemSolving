package dsalgo.datastructures.linkedlist.singlylinkedlist;

public class Node {
    public int data;
    public Node next;

    public Node() {
    }

    public Node(int d) {
        this.data = d;
        this.next = null;
    }

    void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
