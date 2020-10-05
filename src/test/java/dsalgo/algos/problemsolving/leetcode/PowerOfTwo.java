package dsalgo.algos.problemsolving.leetcode;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 218;
        if (n == 1) {
            System.out.println(true);
            System.exit(0);
        }
        if (n == 0) {
            System.out.println(false);
            System.exit(0);
        }
        while (n > 2) {
            if (n % 2 != 0) {
                System.out.println(false);
                System.exit(0);
            }
            n = n / 2;
        }
        System.out.println(true);
    }
}
