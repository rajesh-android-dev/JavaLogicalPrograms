package general_problems;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * Each time Sunny and Johnny take a trip to the Ice Cream Parlor, they pool together money dollars for ice cream.
 * On any given day, the parlor offers a line of n
 * flavors, i, is numbered sequentially with a unique ID number from 1 to n and has a cost associated with it.
 * <p>
 * Given the value of money and the cost of each flavor for t trips to the Ice Cream Parlor, help Sunny and Johnny
 * choose two distinct flavors such that they spend their entire pool of money during each visit. For each trip to the parlor,
 * print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line.
 * You must print the smaller ID first and the larger ID second.
 * <p>
 * Note: Two ice creams having unique IDs i and j may have the same cost (i.e., costi == costj ).
 */
public class IceCreamParlorUsingHashTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int money = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
            solve(arr, money);
        }
        in.close();
    }

    private static void solve(int[] arr, int money) {
        int i1 = 0, i2 = 0;
        Hashtable<Integer, Integer> hmIceCream = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            int rem = money - arr[i];
            if (hmIceCream.containsKey(rem)) {
                i1 = hmIceCream.get(rem) + 1;
                i2 = i + 1;
                break;
            }
            hmIceCream.put(arr[i], i);
        }
        System.out.println(i1 + " " + i2);
    }
}
