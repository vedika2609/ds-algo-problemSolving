package dsalgo.datastructures.linkedlist.singlylinkedlist;

public class SearchElementInLinkedList {

    private Node head;

    public static void main(String[] args) {
        SearchElementInLinkedList linkedList = new SearchElementInLinkedList();
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
        System.out.println(linkedList.search(13));
    }

    private boolean search(int x) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == x)
                return true;
            temp = temp.next;
        }
        return false;
    }
}
