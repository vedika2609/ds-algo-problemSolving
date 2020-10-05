package dsalgo.datastructures.arrays;

/*
 * Created by : vedikagupta
 * Date : 28/09/20
 */
public class ImplementStr {
    public static void main(String[] args) {
        System.out.println(new ImplementStr().strStr("hello", "ll"));
    }

    private int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}