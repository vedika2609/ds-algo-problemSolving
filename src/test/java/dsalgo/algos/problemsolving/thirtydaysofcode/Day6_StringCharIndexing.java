package dsalgo.algos.problemsolving.thirtydaysofcode;

public class Day6_StringCharIndexing {
    public static void main(String[] args) {
        String s = "ivvkx";
        String even = "";
        String odd = "";
        for (int i = 0; i <= s.length() - 1; i += 2) {
            try {
                even += s.charAt(i);
                odd += s.charAt(i + 1);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        System.out.println(even + " " + odd);
    }
}
