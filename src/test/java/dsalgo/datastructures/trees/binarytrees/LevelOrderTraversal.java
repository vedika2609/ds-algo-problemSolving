package dsalgo.datastructures.trees.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        GetHeight.Node root = null;
        root = GetHeight.insert(root, 20);
        root = GetHeight.insert(root, 50);
        root = GetHeight.insert(root, 35);
        root = GetHeight.insert(root, 44);
        root = GetHeight.insert(root, 9);
        root = GetHeight.insert(root, 15);
        root = GetHeight.insert(root, 62);
        root = GetHeight.insert(root, 11);
        root = GetHeight.insert(root, 1);
        levelOrder(root);
    }

    private static void levelOrder(GetHeight.Node root) {
        Queue<GetHeight.Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            GetHeight.Node current = queue.remove();
            System.out.print(current.data + " ");
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
    }
}
