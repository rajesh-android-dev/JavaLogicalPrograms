package general_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :
 * <p>
 * "(p1**n1)(p2**n2)...(pk**nk)"
 * with the p(i) in increasing order and n(i) empty if n(i) is 1.
 * <p>
 * Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 */

public class PrimeDecomp {

    public static String factors(int n) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> numList = new ArrayList<>();
        //check if the number is divisible by 2, if divisible then divide the number by 2 until reminder is 0
        while (n % 2 == 0) {
            numList.add(2);
            n /= 2;
        }

        //check if the number is divisible by prime numbers greater than 2 and increment the value by 2 till reminder is 0
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                numList.add(i);
                n /= i;
            }
        }

        //if the n is greater than 2 and a prime number add the n to list
        if (n > 2) {
            numList.add(n);
        }

        Map<Integer,Long> numMap = numList.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        //sort map after finding the occurences
        Map<Integer, Long> sortedNumMap = new TreeMap<>(numMap);
        for (Map.Entry<Integer, Long> entry : sortedNumMap.entrySet()){
            sb.append("(");
            sb.append("" + entry.getKey());
            if (entry.getValue()>1) {
                sb.append("**");
                sb.append("" + entry.getValue());
            }
            sb.append(")");
        }
        return sb.toString();
    }

}
