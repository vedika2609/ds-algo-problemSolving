package dsalgo.datastructures.stack;

import java.util.LinkedList;
import java.util.Queue;

class ImplementStackUsingSingleQueue {
    private Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        ImplementStackUsingSingleQueue s = new ImplementStackUsingSingleQueue();
        s.push(10);
        s.push(20);
        s.pop();
        s.push(30);
        s.pop();
    }

    private void push(int val) {
        int size = q.size();
        q.add(val);

        for (int i = 0; i < size; i++) {
            int x = q.remove();
            q.add(x);
        }
    }

    private int pop() {
        if (q.isEmpty())
            return -1;
        return q.remove();
    }
}
