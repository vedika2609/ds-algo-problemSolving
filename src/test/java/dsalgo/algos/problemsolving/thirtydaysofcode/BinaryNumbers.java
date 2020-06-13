package dsalgo.algos.problemsolving.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vedikagupta on 31/05/20
 */

public class BinaryNumbers {

    public static void main(String[] args) {
        Integer n = 65535;
        char[] binary = Integer.toBinaryString(n).toCharArray();
        List<Integer> countList = new ArrayList<>();
        for (int i = 0; i < binary.length; i++) {
            int count = 0;
            if (binary[i] == '1') {
                int j = i;
                while (j < binary.length && binary[j] == '1') {
                    count++;
                    j++;
                }
                countList.add(count);
            }
        }
        Collections.sort(countList);
        System.out.println(countList.get(countList.size() - 1));
    }
}
