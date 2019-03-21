package general_problems;

/**
 * Custom class of a Binary search tree.
 */

public class CustomBinarySearchTree {

    private Node root;

    public CustomBinarySearchTree() {
        root = null;
    }

    /**
     * Inserts a new item in BST
     *
     * @param item : item to be inserted
     * @return
     */
    public boolean insert(Person item) {
        Node n = new Node();
        n.data = item;
        n.lc = null;
        n.rc = null;

        if (root == null) {
            root = n;
            return true;
        }

        Node p = root;
        Node c = root;
        while (c != null) {
            p = c;
            if (item.getName().compareTo(c.data.getName()) < 0) {
                c = c.lc;
            } else {
                c = c.rc;
            }
        }
        if (item.getName().compareTo(p.data.getName()) < 0) {
            p.lc = n;
        } else {
            p.rc = n;
        }
        return true;
    }

    /**
     * returns the node for the given key
     *
     * @param key : key of the node
     * @return
     */
    public Node findNode(String key) {
        Node c = root;
        while (c != null) {
            if (key.compareTo(c.data.getName()) == 0) {
                break;
            }
            if (key.compareTo(c.data.getName()) < 0) {
                c = c.lc;
            } else {
                c = c.rc;
            }
        }

        return c;
    }

    /**
     * returns parent node of the given key
     *
     * @param key
     * @return parent node
     */
    public Node findParent(String key) {
        Node p = root;
        Node c = root;
        do {
            if (key.compareTo(c.data.getName()) == 0) {
                break;
            }
            p = c;
            if (key.compareTo(c.data.getName()) < 0) {
                c = c.lc;
            } else {
                c = c.rc;
            }
        } while (c != null);
//        System.out.println(">>" + p.data.getName());
        if (c != null) {
            return p;
        } else {
            return null;
        }
    }

    public Person getData(Node n) {
        return n.data;
    }

    /**
     * Prints child values of the given node in the tree
     *
     * @param n : parent node
     */
    public void showAll(Node n) {
        Node p = n;
        if (p != null) {
            System.out.println(" " + p.data);
            showAll(p.lc);
            showAll(p.rc);
        }
    }

    /**
     * Node class
     */
    public class Node {
        private Node lc;
        private Person data;
        private Node rc;

    }
}
