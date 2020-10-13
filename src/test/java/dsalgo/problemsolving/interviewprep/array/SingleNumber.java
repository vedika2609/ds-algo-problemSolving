package dsalgo.problemsolving.interviewprep.array;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[]{7, 3, 5, 4, 5, 3, 4}));
    }

    private int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums)
            res = res ^ i;
        return res;
    }
}
