package dsalgo.datastructures.stack;

/*
 * Created by : vedikagupta
 * Date : 30/09/20
 */

import java.util.Stack;

public class MinStack {
    private Stack<Integer> s;
    private Stack<Integer> min;
    private Integer minElement;

    private MinStack() {
        s = new Stack<>();
        min = new Stack<>();
    }

    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.getMin();
        s.pop();
        s.getMin();
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
    }

    private void getMin() {
        if (s.isEmpty())
            System.out.println("Stack underflow");
        else
            System.out.println("Min element in stack is: " + minElement);
    }

    private void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }
        int x = s.pop();
        if (x == minElement) {
            min.pop();
            minElement = min.peek();
        }
    }

    private void push(int x) {
        if (s.isEmpty()) {
            minElement = x;
            min.push(minElement);
        } else if (x < minElement) {
            minElement = x;
            min.push(minElement);
        }
        s.push(x);
    }
}
