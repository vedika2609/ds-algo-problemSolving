package dsalgo.datastructures.linkedlist.singlylinkedlist;

//Time Complexity: O(n)

public class GetNthNodeInALinkedList {

    private Node head;

    public static void main(String[] args) {
        GetNthNodeInALinkedList linkedList = new GetNthNodeInALinkedList();
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
        System.out.println(linkedList.getDataAtIndex(4));
    }

    private int getDataAtIndex(int index) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index)
                return temp.data;
            count++;
            temp = temp.next;
        }
        return -1;
    }
}
