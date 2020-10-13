package dsalgo.problemsolving.interviewprep.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Created by : vedikagupta
 * Date : 06/10/20
 */
public class IntersectionOfTwoArraysWithHashmap {
    private List<Integer> intersection;

    public static void main(String[] args) {
        int[] arr1 = {8, 0, 3};
        int[] arr2 = {0, 0};
        int[] intersection = new IntersectionOfTwoArraysWithHashmap().intersect(arr1, arr2);
        for (int i : intersection)
            System.out.print(i + " ");
    }

    private int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[]{};
        intersection = new ArrayList<>();
        Map<Integer, Integer> num1Map = new HashMap<>();
        Map<Integer, Integer> num2Map = new HashMap<>();
        for (int num : nums1)
            num1Map.put(num, num1Map.getOrDefault(num, 0) + 1);
        for (int num : nums2)
            num2Map.put(num, num2Map.getOrDefault(num, 0) + 1);

        if (num1Map.size() < num2Map.size())
            addToList(num1Map, num2Map);
        else
            addToList(num2Map, num1Map);

        return intersection.stream().mapToInt(i -> i).toArray();
    }

    private void addToList(Map<Integer, Integer> num1Map, Map<Integer, Integer> num2Map) {
        for (int num : num1Map.keySet()) {
            if (num2Map.containsKey(num)) {
                int commonFreq = Math.min(num1Map.get(num), num2Map.get(num));
                for (int i = 0; i < commonFreq; i++)
                    intersection.add(num);
            }
        }
    }
}
