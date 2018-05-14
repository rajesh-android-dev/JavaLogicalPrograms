import java.util.Scanner;

/**
 * Find a distinct number N in an array, where the total count of numbers greater than N is equal to the N ex. { 1,1,4,7,9,10,11} = 4
 */
public class ZoDistinctNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        checkDistinctNum(arr);
    }

    private static void checkDistinctNum(int[] arr) {
        int val = 0;
        outerloop:
        for (int i : arr) {
            int rep = 0;
            for (int j : arr) {
                if (rep < 2) {
                    if (j > i) val++;
                    if (j == i) rep++;
                } else {
                    break;
                }
            }
            if (val == i) break outerloop;
        }
        System.out.println(val);
    }
}
