package dsalgo.datastructures.stack;

import java.util.Stack;

/*
 * https://www.geeksforgeeks.org/design-a-stack-that-supports-getmin-in-o1-time-and-o1-extra-space/
 * Stack doesn’t hold actual value of an element if it is minimum so far.
 * Actual minimum element is always stored in minEle
 * */
class MinElementFromStack {
    private Stack<Integer> s;
    private Integer minElement;

    private MinElementFromStack() {
        this.s = new Stack<>();
    }

    public static void main(String[] args) {
        MinElementFromStack s = new MinElementFromStack();
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
        if (x > minElement)
            System.out.println("Popped: " + x);
        else {
            System.out.println(minElement);
            minElement = 2 * minElement - x;
        }
    }

    private void push(int x) {
        if (s.isEmpty()) {
            minElement = x;
            s.push(x);
            System.out.println("Number inserted: " + x);
            return;
        }
        if (x < minElement) {
            s.push(2 * x - minElement);
            minElement = x;
        } else
            s.push(x);
    }
}
