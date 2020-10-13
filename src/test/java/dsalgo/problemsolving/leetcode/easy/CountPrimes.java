package dsalgo.problemsolving.leetcode.easy;
/*
 * Created by : vedikagupta
 * Date : 01/10/20
 */

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(new CountPrimes().countPrimes(5));
    }

    private int countPrimes(int n) {
        if (n < 3)
            return 0;
        if (n == 3)
            return 1;

        int count = 0;
        while (n - 1 > 1) {
            if (isPrime(n - 1))
                count++;
            n--;
        }
        return count;
    }

    private boolean isPrime(int n) {
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        if (n < 25) {
            if (n == 7 || n == 5)
                return true;
            for (int i = 5; i <= n; i++) {
                if (n % i != 0)
                    return true;
            }
        } else {
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i != 0)
                    return true;
            }
        }
        return false;
    }
}