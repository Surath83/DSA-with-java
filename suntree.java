import java.util.*;

public class sumtree {
    class Node {
        int data;
        Node left,right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static int Sumtree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = Sumtree(root.left);
        int rightsum = Sumtree(root.right);
        int data1 = root.data;
        root.data = leftsum + rightsum;
        return root.data;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(Sumtree(root));

    }
}
