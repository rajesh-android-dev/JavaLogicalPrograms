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

    private static void findGCCount(String[][] arr, String father) {
        int childCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].equals(father) && j == 1) {
                    String child = arr[i][j - 1];
                    for (int x = 0; x < arr.length; x++) {
                        for (int y = 0; y < arr[i].length; y++) {
                            if (arr[x][y].equals(child) && y == 1) {
                                childCount++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Total grandsons for " + father + ": " + childCount);
    }
}
