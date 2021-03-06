package zoho_problems;

import java.util.Scanner;

/**
 * Given a two dimensional array of string like
 * <p>
 * <”luke”, “shaw”>
 * <”wayne”, “rooney”>
 * <”rooney”, “ronaldo”>
 * <”shaw”, “rooney”>
 * Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to find his no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.
 */
public class ZoFindGrandChildCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int familyCount = sc.nextInt();
        String[][] arr = new String[familyCount][2];
        for (int i = 0; i < familyCount; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.next();
            }
        }
        String father = sc.next();
        findGCCount(arr, father);
    }

    private static void findGCCount(String[][] array, String father) {
        String arr[] = new String[20];
        int k=0;
        for(int i=0;i<array.length;i++) {
            if(array[i][1].equals(father)) {
                arr[k++] = array[i][0];
            }
        }
        int child = 0;
        for(int j=0;j<arr.length;j++){
            for(int i=0;i<array.length;i++) {
                if(array[i][1].equals(arr[j])) {
                    child++;
                }
            }
        }

        System.out.println(child);
    }
}
