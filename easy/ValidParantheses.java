package easy;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String parantheses = "(]";
        System.out.println(findValidOrNot(parantheses));
    }

    public static boolean findValidOrNot(String s) {
        Stack<Character> stack = new Stack<>();
        for (char parantheses : s.toCharArray()) {
            if (parantheses == '(' || parantheses == '{' || parantheses == '[') {
                stack.add(parantheses);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char poppedElement = stack.pop();
                if (parantheses == ')' && poppedElement != '(' ||
                        parantheses == '}' && poppedElement != '{' ||
                        parantheses == ']' && poppedElement != '[') {
                    return false;
                }
            }
        }
        return true;
    }
}
