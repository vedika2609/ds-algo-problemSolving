package dsalgo.algos.problemsolving;

class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, -1, -1};
        double positive = 0, zero = 0, negative = 0;
        for (int i : arr) {

            if (i > 0)
                ++positive;
            else if (i == 0)
                ++zero;
            else
                ++negative;
        }

        System.out.printf("%.6f %n", positive / arr.length);
        System.out.printf("%.6f %n", negative / arr.length);
        System.out.printf("%.6f %n", zero / arr.length);
    }
}
