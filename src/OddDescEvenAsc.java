import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Print odd number as descending and even number as ascending in the given input
 */
public class OddDescEvenAsc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the total number of values");
        int a = sc.nextInt();
        int[] numArr = new int[a];
        for (int i = 0; i < a; i++){
            numArr[i] = sc.nextInt();
        }

        Stack<Integer> odd = new Stack<>();
        Queue<Integer> even = new PriorityQueue<>();
        for (int val : numArr){
            if (val %2 == 0) even.add(val);
            else odd.add(val);
        }

        while (!odd.isEmpty() || !even.isEmpty()){
            System.out.println(odd.pop());
            System.out.println(even.poll());
        }
    }
}
