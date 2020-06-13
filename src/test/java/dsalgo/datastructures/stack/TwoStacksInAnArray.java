package dsalgo.datastructures.stack;

class TwoStacksInAnArray {
    private int size;
    private int top1;
    private int top2;
    private int[] arr;

    private TwoStacksInAnArray(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public static void main(String[] args) {
        TwoStacksInAnArray twoStacksInAnArray = new TwoStacksInAnArray(5);
        twoStacksInAnArray.push1(10);
        System.out.println(twoStacksInAnArray.pop1());
        twoStacksInAnArray.push2(20);
        System.out.println(twoStacksInAnArray.pop2());
        twoStacksInAnArray.push1(30);
        twoStacksInAnArray.push2(40);
        twoStacksInAnArray.push1(50);
    }

    private void push1(int x) {
        if (top1 + 1 < top2) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("StackImplemtentationDLL Overflow");
            System.exit(1);
        }
    }

    private void push2(int x) {
        if (top1 + 1 <= top2) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("StackImplemtentationDLL Overflow");
            System.exit(1);
        }
    }

    private int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("StackImplemtentationDLL Underflow");
            System.exit(1);
        }
        return 0;
    }

    private int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("StackImplemtentationDLL Underflow");
            System.exit(1);
        }
        return 0;
    }
}