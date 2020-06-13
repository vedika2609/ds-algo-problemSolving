package dsalgo.datastructures.stack;

import java.util.Stack;

/**
 * Created by vedikagupta on 16/04/20
 */

class SortAStackUsingTempStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        System.out.println(sortStack(input));
    }

    private static Stack<Integer> sortStack(Stack<Integer> inputStack) {
        Stack<Integer> tmpStack = new Stack<>();

        tmpStack.push(inputStack.pop());

        while (!inputStack.isEmpty()) {
            int tmp = inputStack.pop();
            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                inputStack.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }
}
