package zoho_problems;

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
        findWeight(a);
    }

    private static void findWeight(int[] numArray){
        int numArraylen = numArray.length;

        for(int i=0; i<numArraylen; i++)
            for(int j=i+1; j<numArraylen; j++)
                if(numArray[i] > numArray[j])
                {
                    int temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
        int[] wegArray = new int[numArraylen];

        for(int i=0; i<numArraylen; i++)
        {
            wegArray[i] = 0;
            int sq =(int) Math.sqrt(numArray[i]);
            if((sq*sq) == numArray[i])
                wegArray[i] = wegArray[i] + 5;

            if(numArray[i]%4==0 || numArray[i]%6==0)
                wegArray[i] = wegArray[i] + 4;

            if(numArray[i]%2 == 0)
                wegArray[i] = wegArray[i] + 3;

        }

        for(int i=0; i<numArraylen; i++)
            System.out.print(numArray[i]+" -- "+wegArray[i]);
    }
}
