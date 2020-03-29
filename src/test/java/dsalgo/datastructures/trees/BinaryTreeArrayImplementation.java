package dsalgo.datastructures.trees;

public class BinaryTreeArrayImplementation {
    public static void main(String[] args) {
        ArrayImplementation arrayImplementation = new ArrayImplementation();
        arrayImplementation.root("A");
//        arrayImplementation.setLeft("B", 0);
        arrayImplementation.setRight("C", 0);
        arrayImplementation.setLeft("D", 1);
        arrayImplementation.setRight("E", 1);
        arrayImplementation.setLeft("F", 2);
        arrayImplementation.printTree();
    }
}