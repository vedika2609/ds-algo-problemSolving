package dsalgo.algos.problemsolving;

/**
 * Created by vedikagupta on 12/04/20
 */

class FindDigits {
    public static void main(String[] args) {
        int n = 12;
        char[] digits = String.valueOf(n).toCharArray();
        int divisorCount = 0;
        for (char digit : digits) {
            int intDigit = Integer.parseInt(String.valueOf(digit));
            if (intDigit != 0 && n % intDigit == 0)
                divisorCount++;
        }
        System.out.println(divisorCount);
    }
}