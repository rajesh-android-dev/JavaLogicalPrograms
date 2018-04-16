import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * The median of a dataset of integers is the midpoint value of the dataset for which an equal number of integers are less than and greater than the value. To find the median, you must first sort your dataset of integers in non-decreasing order, then:
 * <p>
 * If your dataset contains an odd number of elements, the median is the middle element of the sorted sample. In the sorted dataset ,  is the median.
 * If your dataset contains an even number of elements, the median is the average of the two middle elements of the sorted sample. In the sorted dataset ,  is the median.
 * Given an input stream of  integers, you must perform the following task for each  integer:
 * <p>
 * Add the  integer to a running list of integers.
 * Find the median of the updated list (i.e., for the first element through the  element).
 * Print the list's updated median on a new line. The printed value must be a double-precision number scaled to  decimal place (i.e.,  format).
 */

public class RunningMedianUsingHeap1 {
    private static Queue<Integer> low = new PriorityQueue<>(Comparator.reverseOrder());
    private static Queue<Integer> high = new PriorityQueue<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for (int x : a){
            add(x);
        }
    }

    public static void add(int element){
        Queue<Integer> target = low.size() <= high.size() ? low : high;
        target.add(element);
        balance();
    }

    private static void balance() {
        if(!low.isEmpty() && !high.isEmpty() && low.peek() > high.peek()){
            Integer lowHead = low.poll();
            Integer highHead = high.poll();
            low.add(highHead);
            high.add(lowHead);
        }
        System.out.println(median());
    }

    private static double median(){
        if (low.isEmpty() && high.isEmpty()){
            throw new IllegalStateException("Heap is empty");
        }
        else {
            return low.size() == high.size() ? (low.peek() + high.peek())/2.0 : low.peek();
        }
    }
}
