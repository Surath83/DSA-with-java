import org.w3c.dom.Node;

import org.w3c.dom.Node;

public class ptinRang {
    static class Node {
        int data;
        Node left;
        Node rigth;

        public Node(int data) {
            this.data = data;
            root.left = root.right = null;
        }

    }

    static class BinaryTree {
        Node root;

        public Node buildTree(int nodes[]) {
            return null;
        }
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    /*
     * public static Node insert(Node root, int val) {
     * if (root == null) {
     * root = new Node(val);
     * return root;
     * }
     * if (root.data > val) {
     * root.left = insert(root.left, val);
     * } else {
     * root.right = insert(root.right, val);
     * }
     * return root;
     * }
     * 
     * private static void inorder(Node root) {
     * if (root == null) {
     * return;
     * }
     * inorder(root.left);
     * System.out.print(root.data + " ");
     * inorder(root.right);
     * }
     */

    public static void PrintInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            PrintInRange(root.left, k1, k2);
        } else {
            PrintInRange(root.right, k1, k2);
        }
    }

    public static void main(String Args[]) {
        /*int nodes[] = { 8, 5, 3, 1, -1, 4, -1, 6, -1, -1, 10, -1, 11, -1, 14, -1, -1 };
        BinaryTree tree = new BinaryTree(nodes);
        Node root = tree.buildTree(nodes);
        tree.preorder(root);*/

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        System.out.println();

        int k1 = 6;
        int k2 = 12;

        PrintInRange(root, k1, k2);
    }
}
