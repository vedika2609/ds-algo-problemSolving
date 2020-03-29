package dsalgo.datastructures.stack;

import java.util.Stack;

/*
 * https://www.geeksforgeeks.org/design-and-implement-special-stack-data-structure/
 */

public class SpecialStackDSWithSpaceOptimisation extends Stack<Integer> {
    private Stack<Integer> min = new Stack<>();

    public static void main(String[] args) {
        SpecialStackDSWithSpaceOptimisation s = new SpecialStackDSWithSpaceOptimisation();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.push(1);
        s.pop();
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }

    private void push(int x) {
        if (isEmpty()) {
            super.push(x);
            min.push(x);
        } else {
            super.push(x);
            if (min.isEmpty())
                min.push(getMin());
            int y = min.pop();
            if (x < y)
                min.push(x);
            else
                min.push(y);
        }
    }

    public Integer pop() {
        int x = super.pop();
        if (min.search(x) != -1)
            min.pop();
        return x;
    }

    private Integer getMin() {
        return min.pop();
    }
}
