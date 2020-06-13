package dsalgo.datastructures.trees.binarytrees;

public class GetHeight {

    private static int getHeight(Node root) {
        if (root == null)
            return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        return Math.max(rightHeight, leftHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 3);
        root = insert(root, 5);
        root = insert(root, 2);
        root = insert(root, 1);
        root = insert(root, 4);
        root = insert(root, 6);
        root = insert(root, 7);
        System.out.println(getHeight(root) - 1);
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
}
