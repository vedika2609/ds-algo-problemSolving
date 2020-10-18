package dsalgo.datastructures.linkedlist.singlylinkedlist;

class InsertNewNode {
    private Node head;

    public static void main(String[] args) {
        InsertNewNode insertNewNode = new InsertNewNode();
        Node node = new Node();
        insertNewNode.head = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        insertNewNode.head.next = node1;
        node1.next = node2;

        node.printList(insertNewNode.head);
        insertNewNode.insertNodeAtPosition(100, 2);
        System.out.println();
        node.printList(insertNewNode.head);
        insertNewNode.head = insertNewNode.pushNode(0, insertNewNode.head);
        System.out.println();
        node.printList(insertNewNode.head);
        insertNewNode.appendNode(6);
        System.out.println();
        insertNewNode.insertAfterNode(node2, 10);
        node.printList(insertNewNode.head);
    }

    Node pushNode(int newData, Node head) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private void appendNode(int newData) {
        Node newNode = new Node(newData);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    private void insertAfterNode(Node referenceNode, int newData) {
        Node newNode = new Node(newData);
        newNode.next = referenceNode.next;
        referenceNode.next = newNode;
    }

    private void insertNodeAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node node = head;
        int index = 1;
        while (node.next != null) {
            if (index == position) {
                newNode.next = node.next;
                node.next = newNode;
            }
            node = node.next;
            index++;
        }
    }
}