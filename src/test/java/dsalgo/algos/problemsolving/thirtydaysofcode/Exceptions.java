package dsalgo.algos.problemsolving.thirtydaysofcode;

public class Exceptions {
    public static void main(String[] args) {
        int n = 2;
        int p = 4;
        Exceptions exceptions = new Exceptions();
        try {
            int ans = exceptions.power(n, p);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private int power(int n, int p) {
        if (n < 0 || p < 0)
            throw new IllegalArgumentException("n and p should be non-negative");
        return ((int) (Math.pow(n, p)));
    }
}
