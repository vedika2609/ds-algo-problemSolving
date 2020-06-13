package dsalgo.datastructures.stack;

class StackArrayImplementation {
    private static final int MAX = 100;
    private int pop;
    private int[] a = new int[MAX];

    private StackArrayImplementation() {
        pop = -1;
    }

    public static void main(String[] args) {
        StackArrayImplementation stack = new StackArrayImplementation();
        System.out.println("StackImplemtentationDLL is empty: " + stack.isEmpty());
        stack.push(1);
        System.out.println(stack.peek() + " peek in stack");
        stack.push(2);
        System.out.println(stack.peek() + " peek in stack");
        stack.push(3);
        System.out.println(stack.peek() + " peek in stack");
        System.out.println(stack.pop() + " popped from stack");
        System.out.println("StackImplemtentationDLL is empty: " + stack.isEmpty());
    }

    private boolean isEmpty() {
        return pop < 0;
    }

    private boolean push(int x) {
        if (pop >= (MAX - 1)) {
            System.out.println("StackImplemtentationDLL Overflow");
            return false;
        } else {
            a[++pop] = x;
            System.out.println("Pushed Into StackImplemtentationDLL");
            return true;
        }
    }

    private int pop() {
        if (pop < 0) {
            System.out.println("StackImplemtentationDLL Underflow");
            return 0;
        } else
            return a[pop--];
    }

    private int peek() {
        if (pop < 0) {
            System.out.println("StackImplemtentationDLL Underflow");
            return 0;
        } else {
            return a[pop];
        }
    }
}