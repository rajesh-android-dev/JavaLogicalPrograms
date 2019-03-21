package general_problems;

/**
 * Combine two integer array into a new integer array
 */
public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,4,5,7,8,9,10,11,16,18};
        int[] b = {10,40,50,70,80,90,100,110,160,180};
        int[] c = new int[20];
        int index = 0;
        for (int i = 0; i < a.length; i++){
            c[index++] = a[i];
            c[index++] = b[i];
        }
        for (int j : c){
            System.out.print(j+"  ");
        }
    }
}
