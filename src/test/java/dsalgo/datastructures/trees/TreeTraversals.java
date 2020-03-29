package dsalgo.datastructures.trees;

class TreeTraversals {
    private Node root;

    private TreeTraversals() {
        this.root = null;
    }

    public static void main(String[] args) {
        TreeTraversals treeTraversals = new TreeTraversals();
        treeTraversals.root = new Node(1);
        treeTraversals.root.left = new Node(2);
        treeTraversals.root.right = new Node(3);
        treeTraversals.root.left.left = new Node(4);
        treeTraversals.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is:");
        treeTraversals.printPreorder();

        System.out.println("\nInorder traversal of binary tree is:");
        treeTraversals.printInorder();

        System.out.println("\nPostorder traversal of binary tree is:");
        treeTraversals.printPostorder();
    }

    private void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    private void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    private void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    private void printPostorder() {
        printPostorder(root);
    }

    private void printInorder() {
        printInorder(root);
    }

    private void printPreorder() {
        printPreorder(root);
    }
}
