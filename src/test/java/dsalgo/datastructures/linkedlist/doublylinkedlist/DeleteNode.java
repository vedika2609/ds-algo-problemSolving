package dsalgo.datastructures.linkedlist.doublylinkedlist;

public class DeleteNode {

    private Node head;

    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        DLLNodeInsertion dll = new DLLNodeInsertion();
        deleteNode.push(1);
        deleteNode.push(2);
        deleteNode.push(3);
        deleteNode.push(4);
        dll.printDLL(deleteNode.head);
        System.out.println();
        deleteNode.deleteNode(deleteNode.head, deleteNode.head.next.next);
        dll.printDLL(deleteNode.head);
        System.out.println();
    }

    private void push(int new_data) {
        // 1. allocate node
        // 2. put in the data
        Node new_Node = new Node(new_data);

        // 3. Make next of new node as head
        // and previous as NULL
        new_Node.next = head;
        new_Node.prev = null;

        // 4. change prev of head node to new node
        if (head != null)
            head.prev = new_Node;

        // 5. move the head to point to the new node
        head = new_Node;
    }

    private void deleteNode(Node head, Node delete) {
        if (head == null || delete == null)
            return;
        else if (head == delete)
            this.head = delete.next;
        else if (delete.next != null)
            delete.next.prev = delete.prev;
        else if (delete.prev != null)
            delete.prev.next = delete.next;
    }
}
