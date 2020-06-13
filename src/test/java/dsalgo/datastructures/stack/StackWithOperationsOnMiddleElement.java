package dsalgo.datastructures.stack;

/*
 * https://www.geeksforgeeks.org/design-a-stack-with-find-middle-operation/
 * Representation of the stack data structure that supports findMiddle() in O(1) time.  The StackImplemtentationDLL is implemented using Doubly Linked List. It maintains pointer to head node, pointer to middle node and count of nodes
 * */

import dsalgo.datastructures.linkedlist.doublylinkedlist.Node;

public class StackWithOperationsOnMiddleElement {

    public static void main(String[] args) {
        StackWithOperationsOnMiddleElement stackOperations = new StackWithOperationsOnMiddleElement();
        StackImplemtentationDLL stack = stackOperations.createStack();
        stackOperations.push(stack, 5);
        stackOperations.push(stack, 4);
        stackOperations.push(stack, 3);
        stackOperations.deleteMiddle(stack);
        stackOperations.push(stack, 2);
        stackOperations.deleteMiddle(stack);
        stackOperations.push(stack, 1);
        System.out.println("Middle element for stack with odd number of elements: " + stackOperations.findMiddle(stack));
        System.out.println("Popped element: " + stackOperations.pop(stack));
        System.out.println("Middle element for stack with even number of elements: " + stackOperations.findMiddle(stack));
    }

    private void push(StackImplemtentationDLL stack, int newData) {
        Node newNode = new Node(newData);
        newNode.prev = null;
        newNode.next = stack.head;
        stack.count++;

        if (stack.count == 1)
            stack.middle = newNode;
        else {
            stack.head.prev = newNode;
            if (stack.count % 2 != 0)
                stack.middle = stack.middle.prev;
        }
        stack.head = newNode;
    }

    private int pop(StackImplemtentationDLL stack) {
        if (stack.count == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        Node head = stack.head;
        int popElement = head.data;
        stack.head = head.next;

        if (stack.head != null)
            stack.head.prev = null;

        stack.count--;
        if (stack.count % 2 == 0)
            stack.middle = stack.middle.next;

        return popElement;
    }

    private int findMiddle(StackImplemtentationDLL stack) {
        if (stack.count == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.middle.data;
    }

    private void deleteMiddle(StackImplemtentationDLL stack) {
        if (stack.count == 0)
            System.out.println("Stack is empty");

        stack.middle.prev = stack.middle.next;
        stack.count--;
        if (stack.count % 2 == 0)
            stack.middle = stack.middle.next;
        else
            stack.middle = stack.middle.prev;
    }

    private StackImplemtentationDLL createStack() {
        StackImplemtentationDLL stack = new StackImplemtentationDLL();
        stack.count = 0;
        return stack;
    }

    private class StackImplemtentationDLL {
        Node head;
        Node middle;
        int count;
    }
}