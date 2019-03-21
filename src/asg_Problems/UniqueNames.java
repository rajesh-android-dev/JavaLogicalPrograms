package asg_Problems;

import java.util.HashMap;

public class UniqueNames {
    public static String firstUniqueName(String[] names) {
        HashMap<String, Integer> hmName = new HashMap<>();
        for (String name : names) {
            if (hmName.containsKey(name)) {
                int val = hmName.get(name);
                hmName.put(name, ++val);
            } else {
                hmName.put(name, 1);
            }
        }
        for (String name : names) {
            if (hmName.get(name) == 1)
                return name;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[]{"Abbi", "Adeline", "Abbi", "Adalia"}));
    }
}
