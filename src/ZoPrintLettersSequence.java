import java.util.Scanner;

/**
 * print the word with odd letters as
 * P     M
 *  R   A
 *   O R
 *    G
 *   O R
 *  R   A
 * P     M
 */
public class ZoPrintLettersSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        printSequence(input);
    }

    public static void printSequence(String val){
        if (val.length()%2 == 0){
            System.out.println("Not a valid string");
        }
        else {
            int length = val.length();
            for (int i = 0, j = length - 1, k = length - 2; i < length / 2; i++, j--, k -= 2) {
                for (int x = 0; x < i; x++) {
                    System.out.print(" ");
                }
                System.out.print(val.charAt(i));
                for (int y = 0; y < k; y++){
                    System.out.print(" ");
                }
                System.out.println(val.charAt(j));
            }
            for (int i = 0; i < length/2; i++){
                System.out.print(" ");
            }
            System.out.println(val.charAt(length/2));
            for (int i = length/2 - 1, j = length/2 + 1, k = 1; i >= 0; i--,j++,k+=2){
                for (int x = 0; x < i; x++){
                    System.out.print(" ");
                }
                System.out.print(val.charAt(i));
                for (int y = 0; y < k; y++){
                    System.out.print(" ");
                }
                System.out.println(val.charAt(j));
            }
        }
    }
}
