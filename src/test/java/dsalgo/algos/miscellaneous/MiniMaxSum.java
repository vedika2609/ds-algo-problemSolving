package dsalgo.algos.miscellaneous;

import java.util.Arrays;

class MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = {769082435, 210437958, 673982045, 375809214, 380564127};
        Arrays.sort(arr);
        long minSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum = minSum + arr[i];
        }
        long maxSum = minSum - arr[0] + arr[4];
        System.out.print(minSum + " " + maxSum);
    }
}