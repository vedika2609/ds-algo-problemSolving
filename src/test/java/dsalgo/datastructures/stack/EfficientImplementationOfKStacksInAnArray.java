package dsalgo.datastructures.stack;

/*
 * O(1) for push() & pop()
 * https://www.geeksforgeeks.org/efficiently-implement-k-stacks-single-array/
 */

class EfficientImplementationOfKStacksInAnArray {
    private int arr[]; // Array of size n to store actual content to be stored in stacks
    private int top[]; // Array of size k to store indexes of top elements of stacks
    private int next[]; //Array of size n to store next entry in all stacks and free list
    private int n; //
    private int k;
    private int free; // To store beginning index of free list

    private EfficientImplementationOfKStacksInAnArray(int n, int k) {
        this.n = n;
        this.k = k;
        arr = new int[n];
        top = new int[k];
        next = new int[n];

        for (int i = 0; i < k; i++)
            top[i] = -1;

        free = 0;

        for (int i = 0; i < n - 1; i++)
            next[i] = i + 1;
        next[n - 1] = -1;
    }

    public static void main(String[] args) {
        // Let us create 3 stacks in an array of size 10
        int k = 3, n = 10;

        EfficientImplementationOfKStacksInAnArray ks = new EfficientImplementationOfKStacksInAnArray(n, k);

        ks.push(15, 2);
        ks.push(45, 2);

        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }

    private boolean isFull() {
        return free == -1;
    }

    private boolean isEmpty(int stackNumber) {
        return top[stackNumber] == -1;
    }

    //to push x in stack - stackNumber
    private void push(int x, int stackNumber) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        int i = free;
        free = next[i];
        next[i] = top[stackNumber];
        top[stackNumber] = i;

        arr[i] = x;
    }

    //to pop an item from stack number, stack number <- 0 to k-1
    private int pop(int stackNumber) {
        if (isEmpty(stackNumber)) {
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }

        int i = top[stackNumber];
        top[stackNumber] = next[i];
        next[i] = free;
        free = i;

        return arr[i];
    }
}
