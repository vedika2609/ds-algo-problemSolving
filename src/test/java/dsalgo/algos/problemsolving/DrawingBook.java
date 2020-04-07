package dsalgo.algos.problemsolving;

class DrawingBook {
    public static void main(String[] args) {
        int n = 5;
        int[] book = new int[n + 1];
        int page = 4;

        int frontPages = 0;
        int rearPages = 0;

        for (int i = 0; i <= n; i++) {
            book[i] = i;
        }

        for (int i = 0; i <= n; i = i + 2) {
            if (book[i] == page || book[i + 1] == page) {
                break;
            } else
                frontPages++;
        }

        for (int j = n; j >= 0; j = j - 2) {
            if (book[j] == page || book[j - 1] == page)
                break;
            else
                rearPages++;
        }

        System.out.println(Math.min(frontPages, rearPages));
    }
}
