package medium;

import java.util.*;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(result, "", 0, 0, n);
        return result;
    }

    private static void generateParenthesisHelper(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            generateParenthesisHelper(result, current + "(", open + 1, close, max);
        }
        if (close < open) {
            generateParenthesisHelper(result, current + ")", open, close + 1, max);
        }
    }
}
