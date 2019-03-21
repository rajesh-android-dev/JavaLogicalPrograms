package amazon_problems;

/**
 * 1. Find the greatest element in a sorted array where numbers are increased and after a point decreased without
 * changing the order of it
 * {1,2,3,4,5,6,7,3,2,1}
 */
public class GreatestElement {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 3, 2, 1};
        int b[] = {1, 2};
        int c[] = {2,1};
        System.out.println(getGreatestElement(c, 0, c.length));
    }

    private static int getGreatestElement(int[] a, int start, int end) {
        if (end <= 2) {
            if (end == 2)
                return a[start] > a[end - 1] ? a[start] : a[end - 1];
            if (end == 1)
                return a[0];
        }
        int mid = ((start + end) / 2) - 1;
        if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
            return a[mid];
        }
        if (a[mid] > a[mid - 1]) {
            return getGreatestElement(a, mid, end);
        }
        if (a[mid] < a[mid - 1]) {
            return getGreatestElement(a, start, mid);
        }
        return 0;
    }
}
