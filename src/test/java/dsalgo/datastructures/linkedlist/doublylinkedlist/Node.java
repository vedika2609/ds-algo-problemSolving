package dsalgo.datastructures.linkedlist.doublylinkedlist;

public class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int d) {
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}
