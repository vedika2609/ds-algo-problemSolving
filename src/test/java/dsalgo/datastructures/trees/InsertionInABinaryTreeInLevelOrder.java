package dsalgo.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class InsertionInABinaryTreeInLevelOrder {
    private static Node root;
    private static Node temp;

    public static void main(String[] args) {
        InsertionInABinaryTreeInLevelOrder insertion = new InsertionInABinaryTreeInLevelOrder();
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        root.right.left = new Node(5);
        root.right.right = new Node(6);

        System.out.print("Inorder traversal before insertion:");
        Inorder.inorder(root);

        int key = 12;
        insertion.insert(root, key);
        System.out.print("\nInorder traversal after insertion:");
        Inorder.inorder(root);
    }

    private void insert(Node node, int key) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            node = q.peek();
            q.remove();


            if (node.left == null) {
                node.left = new Node(key);
                break;
            } else
                q.add(node.left);

            if (node.right == null) {
                node.right = new Node(key);
                break;
            } else
                q.add(node.right);
        }
    }
}
