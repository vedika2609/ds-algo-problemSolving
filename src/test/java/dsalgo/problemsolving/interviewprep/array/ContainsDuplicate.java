package dsalgo.problemsolving.interviewprep.array;

import java.util.Arrays;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    private boolean containsDuplicate(int[] nums) {
        int size = Arrays.stream(nums).distinct().toArray().length;
        return size != nums.length;
    }
}