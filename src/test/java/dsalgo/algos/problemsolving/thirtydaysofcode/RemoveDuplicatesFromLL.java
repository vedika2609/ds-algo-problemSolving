package dsalgo.algos.problemsolving.thirtydaysofcode;

public class RemoveDuplicatesFromLL {
    private static Node removeDuplicates(Node head) {
        Node ptr1, ptr2;
        ptr1 = head;

        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
            while (ptr2.next != null) {
                if (ptr1.data == ptr2.next.data) {
                    ptr2.next = ptr2.next.next;
                    System.gc();
                } else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
        return head;
    }

    private static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    private static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Node head = null;
        head = insert(head, 1);
        head = insert(head, 1);
        head = insert(head, 1);
        head = insert(head, 1);
        head = insert(head, 1);
        head = insert(head, 1);
        head = insert(head, 1);
        head = removeDuplicates(head);
        display(head);
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
