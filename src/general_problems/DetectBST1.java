package general_problems;

/**
 * Given the root node of a binary tree, can you determine if it's also a binary search tree?
 */
public class DetectBST1 {

    public static void main(String[] args) {
        DetectBST1 detectBST = new DetectBST1(2);
    }

    public DetectBST1(int data) {
        Node root = new Node(data);
        Node node1 = new Node(1);
        Node node2 = new Node(4);
        Node node3 = new Node(3);
        Node node4 = new Node(6);
        Node node5 = new Node(5);
        Node node6 = new Node(7);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        node4.left = node5;
        node4.right = node6;
        System.out.println(checkBST(root));
    }

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    boolean checkBST(Node root) {
        return checkNodes(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    boolean checkNodes(Node n, int min, int max) {
        if (n == null) return true;
        if (n.data <= min || n.data >= max) {
            return false;
        }
        return checkNodes(n.left, min, n.data) &&
                checkNodes(n.right, n.data, max);
    }
}
