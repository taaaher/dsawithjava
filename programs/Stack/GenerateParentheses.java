package dsaWithJava.functions.Stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {

    public static void main(String[] args) {

    }

    List<String> res = new ArrayList<>();
    Stack<Character> stk = new Stack<>();
    public  List<String> generateParenthesis(int n) {

        backtrack(0,0,n);
        return res;
    }

    public  void backtrack(int open, int closed, int n) {
        //Base condition of recursion.
        if(open == closed && closed == n){
            Iterator val = stk.iterator();
            String temp = "";
            while (val.hasNext()){
                temp += val.next();
            }
            res.add(temp);
        }

        if(open<n){
            stk.push('(');
            backtrack(open+1,closed,n);
            stk.pop();
        }
        if(closed<open){
            stk.push(')');
            backtrack(open,closed+1,n);
            stk.pop();
        }
    }

}
