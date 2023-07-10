package dsaWithJava.functions.Stack;
//https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {

    }

    static int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String s : tokens){
            if (s.equals("+")||s.equals("*")||s.equals("-")||s.equals("/")){
                if(stk.isEmpty()){
                    return -1;
                }
                int second = stk.pop();
                int first = stk.pop();
                int ans ;
                //equals method is preffered over ==.
//                == will throw an error if used for comparing.
                if(s.equals("+")){
                     ans = first+second;
                } else if (s.equals("-")){
                     ans = first-second;
                } else if (s.equals("*")){
                     ans = first*second;
                } else {
                     ans = first/second;
                }
                stk.push(ans);
            }else {
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.pop();
    }

}
