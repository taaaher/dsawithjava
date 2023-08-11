package dsaWithJava.functions.Stack;

//https://leetcode.com/problems/valid-parentheses/description/

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    static boolean isValid(String s) {
        //Using only stack
        Stack<Character> stack = new Stack<>();
        if(s.length()%2 != 0){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.empty() && (c == ')'||c == '}'||c == ']')){
                return false;
            }else {
                if(!stack.empty()){
                    if(stack.peek() == '(' && c ==')'){
                        stack.pop();
                    }else if (stack.peek() == '{' && c =='}'){
                        stack.pop();
                    } else if (stack.peek() == '[' && c ==']'){
                        stack.pop();
                    }else {
                        stack.add(c);
                    }
                }else {
                    stack.add(c);
                }
            }
        }
        return stack.empty();
    }

    public boolean isValid1(String s) {
        //Using Hash map
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> mp = new HashMap<>(3);
        mp.put(')','(');
        mp.put(']','[');
        mp.put('}','{');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mp.containsKey(c)){
                if (!stack.isEmpty()){
                    if (mp.get(c).equals(stack.peek())){
                        stack.pop();
                    }
                }else {
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
