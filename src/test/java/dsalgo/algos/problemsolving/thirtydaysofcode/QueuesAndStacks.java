package dsalgo.algos.problemsolving.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class QueuesAndStacks {
    private Queue<Character> queue = new LinkedList<>();
    private Stack<Character> stack = new Stack<>();

    private void pushCharacter(char ch) {
        stack.push(ch);
    }

    private char popCharacter() {
        return stack.pop();
    }

    private void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    private char dequeueCharacter() {
        return queue.remove();
    }
}
