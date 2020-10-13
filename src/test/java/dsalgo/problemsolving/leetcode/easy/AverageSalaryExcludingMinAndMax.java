package dsalgo.problemsolving.leetcode.easy;

import java.util.Arrays;

/*
 * Created by : vedikagupta
 * Date : 13/10/20
 */
public class AverageSalaryExcludingMinAndMax {
    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};
        System.out.println(new AverageSalaryExcludingMinAndMax().average(salary));
    }

    private double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        for (int i = 1; i < salary.length - 1; i++)
            sum += salary[i];
        return (double) sum / (salary.length - 2);
    }
}
