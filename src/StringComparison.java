import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot use substrings or concatenation to create the words he needs.
 * Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
 */
public class StringComparison {
    private String[] magazineArr;
    private String[] noteArr;
    private ArrayList<String> magazineList = new ArrayList<>();
    private ArrayList<String> noteList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        StringComparison s = new StringComparison(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
    }

    public StringComparison(String magazine, String note){
        magazineArr = magazine.split(" ");
        noteArr = note.split(" ");
        Collections.addAll(magazineList,magazineArr);
        Collections.addAll(noteList,noteArr);
    }

    public boolean solve() {
        for (String note : noteList){
            boolean isPresent = false;
            int presentIndex = -1;
            for (int i = 0; i < magazineList.size(); i++){
                String magazine = magazineList.get(i);
                if (note.equals(magazine)){
                    isPresent = true;
                    presentIndex = i;
                }
            }
            if (isPresent){
                magazineList.remove(presentIndex);
            }else {
                return false;
            }
        }
        return true;
    }


}
