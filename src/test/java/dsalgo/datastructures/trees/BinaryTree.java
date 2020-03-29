package dsalgo.datastructures.trees;

public class BinaryTree {
    private Node root;

    public BinaryTree(int key) {
        this.root = new Node(key);
    }

    private BinaryTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
    }
}