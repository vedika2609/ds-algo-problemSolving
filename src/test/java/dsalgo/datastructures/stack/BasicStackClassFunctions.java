package dsalgo.datastructures.stack;

import java.util.Stack;

class BasicStackClassFunctions {

    // Pushing element on the top of the stack
    private static void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    private static void stackPop(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Popped integer in stack: " + stack.pop());
        }
    }

    // Displaying element on the top of the stack
    private static void stackPeek(Stack<Integer> stack) {
        System.out.println("Element on top of stack: " + stack.peek());
    }

    // Searching element in the stack
    private static void stackSearch(Stack<Integer> stack, int element) {
        if (stack.search(element) == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position: " + stack.search(element));
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 2);
        stackSearch(stack, 6);
    }
}