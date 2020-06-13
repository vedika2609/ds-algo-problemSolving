package dsalgo.datastructures.stack;

import dsalgo.datastructures.linkedlist.singlylinkedlist.Node;

class StackLinkedListImplementation {
    private Node root;

    public static void main(String[] args) {
        StackLinkedListImplementation stack = new StackLinkedListImplementation();
        System.out.println(stack.isEmpty());
        stack.push(1);
        System.out.println("Peek: " + stack.peek());
        stack.push(2);
        System.out.println("Peek: " + stack.peek());
        stack.push(3);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
    }

    private boolean isEmpty() {
        return root == null;
    }

    private void push(int data) {
        Node node = new Node(data);
        if (root == null)
            root = node;
        else {
            Node temp = root;
            root = node;
            node.next = temp;
        }
    }

    private int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null)
            System.out.println("StackImplemtentationDLL underflow");
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    private int peek() {
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return root.data;
    }
}