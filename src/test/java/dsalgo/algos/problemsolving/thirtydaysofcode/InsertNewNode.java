package dsalgo.algos.problemsolving.thirtydaysofcode;

import java.util.Scanner;

/**
 * Created by vedikagupta on 11/06/20
 */

public class InsertNewNode {
    private static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null)
            return newNode;
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
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
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
