package dsalgo.datastructures.stack;

import java.util.Stack;

public class ImplementQueueUsingStackWithCostlyDeQueue {
    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    private static void enqueue(int x) {
        stack1.push(x);
    }

    private static int deQueue() {
        if (stack1.empty() && stack2.empty())
            System.exit(0);

        if (stack2.empty()) {
            while (!stack1.empty())
                stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);

        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
        System.out.println(deQueue());
    }
}
