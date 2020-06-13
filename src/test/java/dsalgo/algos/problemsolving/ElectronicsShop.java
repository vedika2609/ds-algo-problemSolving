package dsalgo.algos.problemsolving;

public class ElectronicsShop {
    public static void main(String[] args) {
        int budget = 5;
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int spends = -1;

        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int cost = keyboard + drive;
                if (spends < cost && cost <= budget)
                    spends = cost;
            }
        }
        System.out.println(spends);
    }
}