import java.util.*;

/**
 * Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
 * 1. 5 if a perfect square
 * 2. 4 if multiple of 4 and divisible by 6
 * 3. 3 if even number
 * <p>
 * And sort the numbers based on the weight and print it as follows
 * <p>
 * <10,its_weight>,<36,its weight><89,its weight>
 * <p>
 * Should display the numbers based on increasing order.
 */
public class ZoFindWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = sc.nextInt();
        }
        findWeightOf(a);
    }

    private static void findWeightOf(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : a) {
            double sqrVal = Math.sqrt((double) x);
            int iSqr = (int) sqrVal;
            double rem = sqrVal - (double) iSqr;
            if (rem == 0) {
                map.put(x, 5);
            }
            else if (x % 4 == 0 & x % 6 == 0) {
                map.put(x, 4);
            }
            else if (x % 2 == 0) {
                map.put(x, 3);
            }
        }
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(set);
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for (Map.Entry<Integer,Integer> entry : list){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}
