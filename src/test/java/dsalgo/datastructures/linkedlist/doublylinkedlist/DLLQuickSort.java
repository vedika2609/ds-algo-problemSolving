package dsalgo.datastructures.linkedlist.doublylinkedlist;

public class DLLQuickSort {
    private Node head;

    public static void main(String[] args) {
        DLLNodeInsertion nodeInsertion = new DLLNodeInsertion();
        DLLQuickSort quickSort = new DLLQuickSort();

        quickSort.head = new Node(20);
        Node node1 = new Node(25);
        Node node2 = new Node(15);
        quickSort.head.prev = null;
        quickSort.head.next = node1;
        node1.prev = quickSort.head;
        node1.next = node2;
        node2.prev = node1;
        node2.next = null;
        nodeInsertion.printDLL(quickSort.head);
        System.out.println();
        quickSort.head = nodeInsertion.push(40, quickSort.head);
        quickSort.head = nodeInsertion.push(35, quickSort.head);
        nodeInsertion.printDLL(quickSort.head);
        System.out.println();
        quickSort.quickSort(quickSort.head);
        nodeInsertion.printDLL(quickSort.head);
    }

    // A utility function to find last node of linked list
    private Node lastNode(Node node) {
        while (node.next != null)
            node = node.next;
        return node;
    }

    /*Considers last element as pivot, places the pivot element at its
   correct position in sorted array, and places all smaller (smaller than
   pivot) to left of pivot and all greater elements to right of pivot
     */
    private Node nodePartition(Node l, Node h) {
        int x = h.data; // set pivot as h element
        Node i = l.prev; //similar to i = l-1 for array implementation

        for (Node j = l; j != h; j = j.next) {
            if (j.data <= x) {
                i = (i == null) ? l : i.next;
                int temp = i.data;
                i.data = j.data;
                j.data = temp;
            }
        }
        i = (i == null) ? l : i.next; //similar to i++
        int temp = i.data;
        i.data = h.data;
        h.data = temp;
        return i;
    }

    private void _quickSort(Node l, Node h) {
        if (h != null && l != h && l != h.next) {
            Node temp = nodePartition(l, h);
            _quickSort(l, temp.prev);
            _quickSort(temp.next, h);
        }
    }

    private void quickSort(Node n) {
        Node head = lastNode(n);
        _quickSort(n, head);
    }
}
