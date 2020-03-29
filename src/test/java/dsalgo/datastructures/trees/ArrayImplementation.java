package dsalgo.datastructures.trees;

class ArrayImplementation {
    static private int root = 0;
    static private String[] str = new String[10];

    void root(String key) {
        str[0] = key;
    }

    void setLeft(String key, int root) {
        int t = (root * 2) + 1;
        if (str[root] == null)
            System.out.printf("Can't set child at %d, no parent found", t);
        else
            str[t] = key;
    }

    void setRight(String key, int root) {
        int t = (root * 2) + 2;

        if (str[root] == null)
            System.out.printf("\nCan't set child at %d, no parent found", t);
        else
            str[t] = key;
    }

    void printTree() {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (str[i] != null)
                System.out.print(str[i]);
            else
                System.out.print("-");
        }
    }
}