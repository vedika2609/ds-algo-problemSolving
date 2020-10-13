package dsalgo.datastructures.linkedlist.singlylinkedlist;

/*
 * Created by : vedikagupta
 * Date : 07/10/20
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        Node head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        Node node = list.reverse(head);
        list.printList(node);
    }

    private Node reverse(Node node) {
        if (node == null || node.next == null)
            return node;
        Node toReverse = node.next;
        Node reversed = node;
        while (toReverse != null) {
            Node temp = toReverse;
            toReverse = toReverse.next;

            temp.next = reversed;
            reversed = temp;
        }
        //node = reversed;
        return reversed;
    }

    private void printList(Node node) {
        Node n = node;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}