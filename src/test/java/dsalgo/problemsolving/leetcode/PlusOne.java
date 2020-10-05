package dsalgo.problemsolving.leetcode;

/*
 * Created by : vedikagupta
 * Date : 28/09/20
 */
public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = plusOne.plusOne(new int[]{9, 9, 9});
        for (int i : digits)
            System.out.print(i);
    }

    private int[] plusOne(int[] digits) {
        int n = digits.length;
        if (n == 0)
            return digits;

        if (digits[n - 1] < 9) {
            digits[n - 1] = digits[n - 1] + 1;
            return digits;
        }
        for (int i = n - 1; i > 0; i--) {
            digits[i] = 0;
            digits[i - 1] += 1;
            if (digits[i - 1] != 10)
                break;
        }

        boolean allNine = true;
        for (int d : digits) {
            if (d != 9) {
                allNine = false;
                break;
            }
        }

        if (digits[0] == 10 || allNine) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}