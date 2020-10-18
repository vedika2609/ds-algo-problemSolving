package dsalgo.datastructures.linkedlist.singlylinkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Created by : vedikagupta
 * Date : 14/10/20
 */
public class AlternateFirstLastElements {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.printList(head);

        System.out.println();
        new AlternateFirstLastElements().arrange(head);
        head.printList(head);
    }

    private void arrange(Node head) {
        Deque<Integer> deque = new ArrayDeque<>();
        Node temp = head;
        while (temp != null) {
            deque.addLast(temp.data);
            temp = temp.next;
        }
        temp = head;
        int i = 0;
        while (!deque.isEmpty()) {
            if (i % 2 == 0)
                temp.data = deque.removeFirst();
            else
                temp.data = deque.removeLast();

            i++;
            temp = temp.next;
        }
    }
}
