package dsalgo.datastructures.stack;

import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingQueuesWithExpensivePop {

    public static void main(String[] args) {
        Stack s = new Stack();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        System.out.println("current size: " + Stack.size());
        System.out.println(Stack.pop());
        Stack.pop();
        System.out.println(Stack.pop());
        Stack.pop();

        System.out.println("current size: " + Stack.size());
    }

    static class Stack {
        private static Queue<Integer> q1 = new LinkedList<>();
        private static Queue<Integer> q2 = new LinkedList<>();

        private static int currentSize = 0;

        private static void push(int x) {
            currentSize++;
            q1.add(x);
        }

        private static int pop() {
            while (q1.size() > 1) {
                q2.add(q1.peek());
                q1.remove();
                currentSize--;
            }
            int pop = q1.remove();
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
            return pop;
        }

        private static int size() {
            return currentSize;
        }
    }
}
