package dsalgo.algos.problemsolving;

import java.util.stream.Collectors;

/**
 * Created by vedikagupta on 12/04/20
 */

class StringConstruction {
    public static void main(String[] args) {
        String s = "abcd";
        int cost = s.chars().distinct().mapToObj(x -> (char) x).collect(Collectors.toList()).size();
        System.out.println(cost);
    }
}
