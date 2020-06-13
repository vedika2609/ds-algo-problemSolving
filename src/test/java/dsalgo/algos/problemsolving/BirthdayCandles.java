package dsalgo.algos.problemsolving;

import java.util.Arrays;
import java.util.Collections;

class BirthdayCandles {
    public static void main(String[] args) {
        int[] arrInt = {3, 2, 1, 3};
        Integer[] arrInteger = Arrays.stream(arrInt).boxed().toArray(Integer[]::new);
        int tallestCandleSize = Arrays.stream(arrInt).max().getAsInt();
        System.out.println(Collections.frequency(Arrays.asList(arrInteger), tallestCandleSize));
    }
}