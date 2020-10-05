package dsalgo.problemsolving.arcesium;

import java.util.Arrays;

/*
 * Created by : vedikagupta
 * Date : 05/10/20
 */
public class MaximumIntervalsOverlap {
    public static void main(String[] args) {
        new MaximumIntervalsOverlap().findMaxGuests(new int[]{1, 2, 10, 5, 5}, new int[]{4, 5, 12, 9, 12});
    }

    private void findMaxGuests(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int guestsIn = 1;
        int maxGuests = 1;
        int time = arr[0];
        int i = 1, j = 0;

        while (i < arr.length && j < arr.length) {
            if (arr[i] <= dep[j]) {
                guestsIn++;
                if (guestsIn > maxGuests) {
                    maxGuests = guestsIn;
                    time = arr[i];
                }
                i++;
            } else {
                guestsIn--;
                j++;
            }
        }
        System.out.println("Maximum Number of Guests = " + maxGuests + " at time " + time);
    }
}