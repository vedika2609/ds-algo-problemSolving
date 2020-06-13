package dsalgo.algos.problemsolving;

class Kangaroo {
    public static void main(String[] args) {
        int x1 = 43;
        int v1 = 2;
        int x2 = 70;
        int v2 = 2;

        if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2))
            System.out.println("NO");
        else if (v1 == v2 && x1 < x2)
            System.out.println("NO");
        else if ((x1 - x2) % (v2 - v1) == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
