package dsalgo.algos.problemsolving;

public class IntroToConditionals {
    public static void main(String[] args) {
        int n = 24;

        if (n % 2 != 0)
            System.out.println("Weird");
        else if (n == 2 || n == 4)
            System.out.println("Not Weird");
        else if (n >= 6 && n <= 20 && n % 2 == 0)
            System.out.println("Weird");
        else if (n % 2 == 0 && n > 20)
            System.out.println("Not Weird");
    }
}
