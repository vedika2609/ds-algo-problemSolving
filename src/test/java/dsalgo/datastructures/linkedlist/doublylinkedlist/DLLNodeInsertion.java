package dsalgo.datastructures.linkedlist.doublylinkedlist;

class DLLNodeInsertion {
    Node head;

    public static void main(String[] args) {
        DLLNodeInsertion doublyLinkedList = new DLLNodeInsertion();
        doublyLinkedList.head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);

        doublyLinkedList.head.prev = null;
        doublyLinkedList.head.next = node1;
        node1.prev = doublyLinkedList.head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = null;
        System.out.println(node1.prev.data);
        doublyLinkedList.printDLL(doublyLinkedList.head);
        System.out.println();
        doublyLinkedList.push(10, doublyLinkedList.head);
        doublyLinkedList.printDLL(doublyLinkedList.head);
    }

    private void insertAfter(Node prevNode, int newData) {
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null)
            newNode.next.prev = newNode;
    }

    Node push(int newData, Node head) {
        Node newNode = new Node(newData);
        newNode.next = head;
        newNode.prev = null;

        if (head != null)
            head.prev = newNode;
        return newNode;
    }

    void printDLL(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
