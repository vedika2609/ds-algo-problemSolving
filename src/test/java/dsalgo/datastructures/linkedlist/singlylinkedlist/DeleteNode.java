package dsalgo.datastructures.linkedlist.singlylinkedlist;

public class DeleteNode {

    private Node head;

    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        InsertNewNode insertNewNode = new InsertNewNode();
        Node node = new Node();

        deleteNode.head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);

        deleteNode.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        deleteNode.head = insertNewNode.pushNode(10, deleteNode.head);
        node.printList(deleteNode.head);
        System.out.println();
        deleteNode.deleteNode(2);
        node.printList(deleteNode.head);
        System.out.println();
        deleteNode.deleteNodeAtPosition(2);
        node.printList(deleteNode.head);
        deleteNode.deleteLinkedList();
        System.out.println();
        String deleteMsg = deleteNode.head == null ? "LinkedList is successfully deleted" : "Couldn't delete the linked list";
        System.out.println(deleteMsg);

    }

    private void deleteLinkedList() {
        head = null;
    }

    private void deleteNodeAtPosition(int position) {
        Node temp = head;

        if (head == null)
            return;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; i < position - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;
        temp.next = next;
    }

    private void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) { //if head is the actual key to be deleted
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) //if key is not present in the LL
            return;

        prev.next = temp.next; //unlink the node from LL
    }
}
