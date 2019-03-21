package general_problems;

import java.util.*;

/**
 *The median of a dataset of integers is the midpoint value of the dataset for which an equal number of integers are less than and greater than the value. To find the median, you must first sort your dataset of integers in non-decreasing order, then:

 If your dataset contains an odd number of elements, the median is the middle element of the sorted sample. In the sorted dataset ,  is the median.
 If your dataset contains an even number of elements, the median is the average of the two middle elements of the sorted sample. In the sorted dataset ,  is the median.
 Given an input stream of  integers, you must perform the following task for each  integer:

 Add the  integer to a running list of integers.
 Find the median of the updated list (i.e., for the first element through the  element).
 Print the list's updated median on a new line. The printed value must be a double-precision number scaled to  decimal place (i.e.,  format).
 */
public class RunningMedianUsingHeap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int i = 0;
        while (i < a.length){
            List<Integer> lsVal = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                lsVal.add(a[j]);
            }
            Collections.sort(lsVal);
            if (lsVal.size()%2==0){
                double x = lsVal.get((lsVal.size()/2)-1);
                double y = lsVal.get(lsVal.size()/2);
                double d = (x+y)/2;
                System.out.println(d);
            }else {
                double d = lsVal.get(lsVal.size()/2);
                System.out.println(d);
            }
            i++;
        }
    }


}
