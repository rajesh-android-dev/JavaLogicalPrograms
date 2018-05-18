import java.util.Scanner;

/**
 * Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.
 * <p>
 * w	e	L	C	O
 * M	E	T	O	Z
 * O	H	O	C	O
 * R	P	O	R	A
 * T	I	O	n
 * And print the start and ending index as
 * <p>
 * Start index : <1,2>
 * <p>
 * End index: <3, 2>
 */
public class ZoStringto2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();
        String sub = sc.next();
        findStartEndIndex(val, sub);
    }

    private static void findStartEndIndex(String val, String sub) {
        int n = 5;
        char[][] arr = new char[n][n];
        int x = 0;
        //convert string into 2d array
        outerloop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x < val.length()) {
                    arr[i][j] = val.charAt(x);
                    x++;
                } else {
                    break outerloop;
                }
            }
        }
        //traverse the 2d array and find the substring too is available or not
        outerloop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == sub.charAt(0)) {
                    //check for top bottom string
                    if (arr[i + 1][j] == sub.charAt(1) && arr[i + 2][j] == sub.charAt(2)) {
                        System.out.println("Start index : <" + i + "," + j + ">");
                        System.out.println("End index : <" + (i + 2) + "," + j + ">");
                        break outerloop;
                    }
                    //check for right left string
                    if (arr[i][j + 1] == sub.charAt(1) && arr[i][j + 2] == sub.charAt(2)) {
                        System.out.println("Start index : <" + i + "," + j + ">");
                        System.out.println("End index : <" + i + "," + (j + 2) + ">");
                    }
                }
            }
        }

    }
}
