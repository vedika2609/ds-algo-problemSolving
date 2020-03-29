package corejavaandcollections.collections;

import java.util.ArrayList;
import java.util.Collections;

class MaxDifference {
    private static int[] a = {6, 7, 9, 5, 6, 3, 2};

    public static void main(String[] args) {
        ArrayList<Integer> diff = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (i < j && a[i] < a[j]) {
                    int d = a[j] - a[i];
                    diff.add(d);
                } else
                    diff.add(-1);
            }
        }
        System.out.println(Collections.max(diff));
    }
}
