package Simple;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;

        HashMap<Character, Character> m = new HashMap<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++){
            if(m.containsKey(s.charAt(i))){
                if (stack.isEmpty())
                    return false;
                if (stack.pop() != m.get(s.charAt(i))) {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[";
        System.out.println(isValid(s));
    }
}
