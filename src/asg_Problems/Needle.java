package asg_Problems;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;

public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
        String isString = convertStreamToString(haystack);
        String[] words = isString.split("\\W+");
        HashMap<String, Integer> hmWords = new HashMap<>();
        for (String word : words){
            if (hmWords.containsKey(word)) {
                int val = hmWords.get(word);
                hmWords.put(word, ++val);
            } else {
                hmWords.put(word, 1);
            }
        }
        return hmWords.containsKey(needle) ? hmWords.get(needle) : 0;
    }

    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there! How are you today? Yes, you over there.";

        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("there", inStream));
        }
    }

    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }
}
