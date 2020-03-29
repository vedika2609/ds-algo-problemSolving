package dsalgo.datastructures.linkedlist.doublylinkedlist;

class ReverseDLL {

    static Node head;
    private DLLNodeInsertion nodeInsertion;

    public static void main(String[] args) {
        ReverseDLL reverseDLL = new ReverseDLL();
        reverseDLL.nodeInsertion = new DLLNodeInsertion();
        head = new Node(0);
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        head.prev = null;
        head.next = node1;
        node1.prev = head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = null;
        reverseDLL.nodeInsertion.head = head;
        reverseDLL.nodeInsertion.printDLL(head);
        System.out.println();
        reverseDLL.nodeInsertion.printDLL(reverseDLL.reverse(head));
        System.out.println();
    }

    private Node reverse(Node head) {
        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;   //swap the next and prev pointer
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        return temp.prev;
    }
}
