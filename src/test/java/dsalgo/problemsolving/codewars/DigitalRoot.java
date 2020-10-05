package dsalgo.problemsolving.codewars;

/*
 * Created by : vedikagupta
 * Date : 30/09/20
 */
public class DigitalRoot {
    private static void main(String[] args) {
        System.out.println(digitalRoot(69845698));
    }

    private static int digitalRoot(int n) {
        int sum = digitSum(n);
        if (digitSum(n) < 10)
            return sum;
        else
            return digitalRoot(sum);

    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
