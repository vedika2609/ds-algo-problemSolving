package dsalgo.datastructures.stack;

/**
 * Created by vedikagupta on 14/04/20
 */

//O(n) time & O(1) space

class ReverseAStackWithoutExtraSpace {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Original Stack");
        s.print();
        s.reverse();
        System.out.println("Reversed Stack");
        s.print();
    }

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        StackNode head;

        private void push(int data) {
            if (this.head == null)
                head = new StackNode(data);

            StackNode stackNode = new StackNode(data);
            stackNode.next = head;
            head = stackNode;
        }

        private StackNode pop() {
            StackNode stackNode = head;
            head = head.next;
            return stackNode;
        }

        private void print() {
            StackNode stackNode = head;
            while (stackNode.next != null) {
                System.out.print(stackNode.data + " ");
                stackNode = stackNode.next;
            }
            System.out.println();
        }

        private void reverse() {
            StackNode prev = null;
            StackNode current = head;
            StackNode next;

            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
    }
}
