package dsalgo.datastructures.stack;

import java.util.Stack;

public class ImplementQueueUsingStackWithCostlyEnQueue {
    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    private static void enqueue(int x) {
        while (!stack1.empty())
            stack2.push(stack1.pop());

        stack1.push(x);
        while (!stack2.empty())
            stack1.push(stack2.pop());
    }

    private static int dequeue() {
        if (stack1.empty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }

        int x = stack1.peek();
        stack1.pop();
        return x;
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);

        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
    }
}
