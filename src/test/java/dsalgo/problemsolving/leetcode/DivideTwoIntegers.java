package dsalgo.problemsolving.leetcode;

/*
 * Created by : vedikagupta
 * Date : 03/10/20
 */
public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(new DivideTwoIntegers().divide(-21474836, -1));
    }

    private int divide(int dividend, int divisor) {
        if (dividend == divisor)
            return 1;
        if (Math.abs(dividend) == divisor || dividend == Math.abs(divisor))
            return -1;
        if (divisor == 1 && dividend > 0)
            return dividend;
        if (divisor == 1 && dividend < 0)
            return -dividend;
        if (divisor == -1 && dividend > 0)
            return -dividend;
        if (divisor == -1 && dividend < 0)
            return -dividend;

        int answer = 0;
        for (int i = Math.abs(divisor); i <= Math.abs(dividend); i = i + Math.abs(divisor)) {
            answer++;
        }
        if (dividend < 0 && divisor < 0)
            return answer;
        if (dividend < 0 || divisor < 0)
            return -(answer);
        return answer;
    }
}
