package HomeWork3.Task4;

import java.util.Stack;

public class Stacks {
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();


        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }


    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
