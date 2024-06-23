package easy;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String parantheses = "(]";
        System.out.println(findValidOrNot(parantheses));
    }

    public static boolean findValidOrNot(String s) {
        Stack<Character> stack = new Stack<>();
        char top = '(';
        for (char parentheses : s.toCharArray()) {
            if (parentheses == '(' || parentheses == '{' || parentheses == '[') {
                stack.push(parentheses);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                top = stack.pop();
                if ((parentheses == ')' && top != '(') ||
                        (parentheses == '}' && top != '{') ||
                        (parentheses == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
