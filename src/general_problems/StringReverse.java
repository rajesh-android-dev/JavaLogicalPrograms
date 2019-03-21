package general_problems;

public class StringReverse {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        String str = "Type a string to reverse:";
        int index = str.length() - 1;
        while (index >= 0) {
            System.out.println(str.substring(index, index + 1));
            index--;
        }
    }
}
