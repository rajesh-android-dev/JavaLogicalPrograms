import java.util.ArrayList;

/**
 * A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
 * <p>
 * Complete the function provided in the editor below. It has one parameter: a pointer to a Node object named  that points to the head of a linked list. Your function must return a boolean denoting whether or not there is a cycle in the list. If there is a cycle, return true; otherwise, return false.
 * <p>
 * Note: If the list is empty, head will be null.
 */
public class DetectCycleLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    DetectCycleLinkedList() {
        Node head = new Node(1);
//        Node node1 = new Node(2);
//        Node node2 = new Node(3);
        head.next = null;
//        node1.next = node2;
//        node2.next = node1;
        System.out.println(hasCycle(head));
    }

    public static void main(String[] args) {
        DetectCycleLinkedList detect = new DetectCycleLinkedList();
    }

    boolean hasCycle(Node head) {
        if (head== null) return false;
        else {
            ArrayList<Integer> dataList = new ArrayList<>();
            Node node = head;
            while (node.next != null) {
                if (dataList.contains(node.data)) return true;
                else dataList.add(node.data);
                node = node.next;
            }
            return false;
        }
    }
}
