package amazon_problems;

import java.util.*;

/* Java program to design a data structure that support folloiwng operations
   in 0(1) time
   a) Insert
   b) Delete
   c) Search
   d) getRandom */
public class DataStructConstantRuntime {

    private ArrayList<Integer> arr;
    private HashMap<Integer, Integer> map;

    public DataStructConstantRuntime() {
        arr = new ArrayList<>();
        map = new HashMap<>();
    }

    void add(int x) {
        if (map.get(x) != null)
            return;
        int size = arr.size();
        map.put(x, size);
        arr.add(x);
    }

    Integer search(int x) {
        return map.get(x);
    }

    void remove(int x) {
        Integer index = map.get(x);
        if (index == null)
            return;
        map.remove(x);
        int size = arr.size();
        int last = arr.get(size - 1);
        Collections.swap(arr, index,size-1);
        arr.remove(size-1);
        map.put(last, index);
    }

    int getRandom() {
        Random rand = new Random();
        int index = rand.nextInt(arr.size());
        return arr.get(index);
    }

    public static void main(String[] args) {
        DataStructConstantRuntime ds = new DataStructConstantRuntime();
        ds.add(10);
        ds.add(20);
        ds.add(30);
        ds.add(40);
        System.out.println(ds.search(30));
        ds.remove(20);
        ds.add(50);
        System.out.println(ds.search(50));
        System.out.println(ds.getRandom());
    }
}
