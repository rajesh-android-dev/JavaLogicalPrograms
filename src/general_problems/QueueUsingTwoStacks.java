package general_problems;

import java.util.*;

/**
 * In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:
 * <p>
 * 1 x: Enqueue element  into the end of the queue.
 * 2: Dequeue the element at the front of the queue.
 * 3: Print the element at the front of the queue.
 */
public class QueueUsingTwoStacks {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {
            loadOldStack();
            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            loadOldStack();
            return stackOldestOnTop.pop();
        }

        public void loadOldStack(){
            if (stackOldestOnTop.empty())
                while (!stackNewestOnTop.empty())
                    stackOldestOnTop.push(stackNewestOnTop.pop());
        }

    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
