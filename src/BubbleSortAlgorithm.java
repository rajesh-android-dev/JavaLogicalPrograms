import java.util.Scanner;

/**
 *Given an -element array, , of distinct elements, sort array  in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:

 Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
 First Element: firstElement, where  is the first element in the sorted array.
 Last Element: lastElement, where  is the last element in the sorted array.
 */
public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int x = 0; x < n; x++){
            a[x] = sc.nextInt();
        }

        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a,j, j + 1);
                    numSwaps++;
                }
            }

        }
        System.out.println("Array is sorted in " + numSwaps + " swaps");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }

    private static void swap(int[] a, int bigNumIndex, int smallNumIndex){
        int sNum = a[smallNumIndex];
        a[smallNumIndex] = a[bigNumIndex];
        a[bigNumIndex] = sNum;
    }
}
