import java.util.Scanner;
import java.util.Stack;

/**
 * wo brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().
 * <p>
 * A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].
 * <p>
 * Some examples of balanced brackets are []{}(), [({})]{}() and ({(){}[]})[].
 * <p>
 * By this logic, we say a sequence of brackets is considered to be balanced if the following conditions are met:
 * <p>
 * It contains no unmatched brackets.
 * The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
 */
public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
        if (expression.length() % 2 != 0) {
            return false;
        } else {
            Stack<Character> stExpr = new Stack<>();
            char[] expr = expression.toCharArray();
            for (char c : expr){
                switch (c){
                    case '{' : stExpr.push('}');
                    break;
                    case '(' : stExpr.push(')');
                        break;
                    case '[' : stExpr.push(']');
                        break;
                    default:
                        if (stExpr.empty() || stExpr.peek() != c) return false;
                        stExpr.pop();
                }

            }
            return stExpr.empty();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
