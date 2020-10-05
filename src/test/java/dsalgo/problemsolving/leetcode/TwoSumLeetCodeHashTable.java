package dsalgo.problemsolving.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Created by : vedikagupta
 * Date : 21/09/20
 */
public class TwoSumLeetCodeHashTable {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSumLeetCode twoSum = new TwoSumLeetCode();
        Arrays.stream(twoSum.twoSum(nums, target)).forEach(x -> System.out.print(x + " "));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement) && map.get(complement) != i)
                return new int[]{i, map.get(complement)};
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}