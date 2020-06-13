package dsalgo.datastructures.stack;

import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingQueuesWithExpensivePush {
    public static void main(String[] args) {
        Stack s = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        System.out.println("current size: " + Stack.size());
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());
        Stack.pop();
        System.out.println(Stack.top());

        System.out.println("current size: " + Stack.size());
    }

    static class Stack {
        private static Queue<Integer> q1 = new LinkedList<>();
        private static Queue<Integer> q2 = new LinkedList<>();

        private static int currentSize = 0;

        private static void push(int x) {
            currentSize++;
            q2.add(x);

            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        private static void pop() {
            if (q1.isEmpty())
                return;
            q1.remove();
            currentSize--;
        }

        private static int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        private static int size() {
            return currentSize;
        }
    }
}
