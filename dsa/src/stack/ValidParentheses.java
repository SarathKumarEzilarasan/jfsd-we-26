package stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[(])";
        System.out.println(isValid(s));
    }

    // time  -> o(n)
    // space -> o(n)
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

// stack -> LIFO