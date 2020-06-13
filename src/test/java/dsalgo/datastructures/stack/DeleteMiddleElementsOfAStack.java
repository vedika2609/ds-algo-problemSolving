package dsalgo.datastructures.stack;

import java.util.Stack;

class DeleteMiddleElementsOfAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        DeleteMiddleElementsOfAStack deleteMiddleElementsOfAStack = new DeleteMiddleElementsOfAStack();

        // push elements into the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        deleteMiddleElementsOfAStack.deleteMid(st, st.size(), st.size());
        while (!st.empty()) {
            int p = st.pop();
            System.out.print(p + " ");
        }
    }

    private void deleteMid(Stack<Integer> stack, int n, int curr) {
        if (stack.empty() || curr == 0)
            return;

        int x = stack.pop();
        deleteMid(stack, n, curr - 1);

        if (curr != n / 2)
            stack.push(x);

    }
}