import java.util.Scanner;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 * Input: arr[]   = {3, 0, 0, 2, 0, 4}
 * Output: 10
 */
public class ZoRainTrapping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        findWater(arr);
    }

    private static void findWater(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int water = 0;

        left[0] = arr[0];
        right[n-1] = arr[n-1];

        //traverse the array and find the maximum height of left array for every element
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i-1],arr[i]);

        //traverse the array and find the maximum height of right array for every element
        for (int i = n-2; i >= 0; i--)
            right[i] = Math.max(right[i+1],arr[i]);

        //find water on each block by getting the minimum height of block to it's left and right side
        //and subtract the block's height with the minimum height
        for (int i = 0; i < n; i++)
            water += Math.min(left[i],right[i]) - arr[i];

        System.out.println("water trapped : " + water);
    }


}
