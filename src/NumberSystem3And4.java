import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Form a number system with only 3 and 4. Find the nth number of the number system.
 Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….
 */
public class NumberSystem3And4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findNumber(sc.nextInt());
    }

    private static void findNumber(int n) {
        ArrayList<String> numList = new ArrayList<>();
        numList.add("3");
        numList.add("4");
        while (numList.size() <= n){
            ArrayList<String> threePrefList = new ArrayList<>();
            ArrayList<String> fourPrefList = new ArrayList<>();
            int count = 0;
            for (int i = count; i < numList.size(); i++){
                threePrefList.add("3"+numList.get(i));
                fourPrefList.add("4"+numList.get(i));
                count++;
            }
            for (String threePref : threePrefList) numList.add(threePref);
            for (String fourPref : fourPrefList) numList.add(fourPref);
        }

        System.out.println(numList.get(n));
    }
}
