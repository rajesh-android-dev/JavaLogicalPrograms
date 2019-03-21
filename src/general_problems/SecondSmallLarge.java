package general_problems;

/**
 * Find second smallest and second largest number among the given random numbers from array
 */
public class SecondSmallLarge {
    public static void main(String[] args) {
        int[] a =  {1,50,34,5,6,56,82,43,101,121};
        int small = a[0];
        int large = a[0];
        int sSmall = Integer.MAX_VALUE;
        int sLarge = Integer.MAX_VALUE;
        for (int i = 1; i<a.length; i++){
            if (a[i] < small){
                sSmall = small;
                small = a[i];
            }
            else if (a[i] < sSmall){
                sSmall = a[i];
            }

            if (a[i] > large){
                sLarge = large;
                large = a[i];
            }
            else if (a[i] > sLarge){
                sLarge = a[i];
            }
        }
        System.out.println("second small is " + sSmall + " second large is " + sLarge);
    }
}
