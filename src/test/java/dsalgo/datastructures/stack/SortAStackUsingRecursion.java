package dsalgo.datastructures.stack;

import java.util.Stack;

class SortAStackUsingRecursion {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        SortAStackUsingRecursion sortStack = new SortAStackUsingRecursion();
        stack.push(-3);
        stack.push(14);
        stack.push(18);
        stack.push(-5);
        stack.push(30);
        System.out.println(sortStack.sortStack(stack));
    }

    private Stack<Integer> sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int temp = s.pop();
            sortStack(s);
            sortedInsert(s, temp);
        }
        return s;
    }

    private void sortedInsert(Stack<Integer> s, int element) {
        if (s.isEmpty() || element > s.peek())
            s.push(element);
        else {
            int temp = s.pop();
            sortedInsert(s, element);
            s.push(temp);
        }
    }
}