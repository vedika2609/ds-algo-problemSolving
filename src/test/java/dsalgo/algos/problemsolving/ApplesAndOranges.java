package dsalgo.algos.problemsolving;

class ApplesAndOranges {
    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        int applesCount = 0;
        int orangesCount = 0;
        for (int i : apples) {
            if (a + i >= s && a + i <= t)
                applesCount++;
        }
        for (int j : oranges) {
            if (b + j >= s && b + j <= t)
                orangesCount++;
        }
        System.out.println(applesCount);
        System.out.println(orangesCount);
    }
}