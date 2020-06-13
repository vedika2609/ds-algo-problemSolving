package dsalgo.algos.problemsolving;

class BreakingTheRecords {
    public static void main(String[] args) {
        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};

        int maxScore = scores[0];
        int minScore = scores[0];

        int maxScoreCount = 0;
        int minScoreCount = 0;

        for (int i = 1; i < scores.length; i++) {
            int score = scores[i];

            if (score > maxScore) {
                maxScore = score;
                maxScoreCount++;
            }
            if (score < minScore) {
                minScore = score;
                minScoreCount++;
            }
        }
        System.out.println(maxScoreCount + " " + minScoreCount);
    }
}