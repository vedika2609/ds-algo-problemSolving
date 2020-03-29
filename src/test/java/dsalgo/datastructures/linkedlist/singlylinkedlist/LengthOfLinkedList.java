package dsalgo.datastructures.linkedlist.singlylinkedlist;

public class LengthOfLinkedList {

    private Node head;

    public static void main(String[] args) {
        LengthOfLinkedList linkedList = new LengthOfLinkedList();
        InsertNewNode newNode = new InsertNewNode();

        linkedList.head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        linkedList.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        newNode.printList(linkedList.head);
        System.out.println();
        System.out.println(linkedList.getLength());
        System.out.println(linkedList.getCountRec());
    }

    private int getCountRec() {
        return getCountRecursive(head);
    }

    private int getCountRecursive(Node node) {
        if (node == null)
            return 0;
        return getCountRecursive(node.next) + 1;
    }


    //    iterative solution
    private int getLength() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
