import java.util.ArrayList;

/**
 * Given the root node of a binary tree, can you determine if it's also a binary search tree?
 */
public class DetectBST {

    public static void main(String[] args) {
        DetectBST detectBST = new DetectBST(2);
    }

    public DetectBST(int data) {
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
        ArrayList<Integer> arr=new ArrayList<Integer>();
        inorder(root,arr);
        for(int i=1;i<arr.size();i++)
            if(arr.get(i)>arr.get(i-1))
                continue;
            else
                return false;
        return true;
    }

    void inorder(Node root,ArrayList<Integer> ar)
    {
        if(root==null)return;
        inorder(root.left,ar);
        ar.add(root.data);
        inorder(root.right,ar);
    }
}
