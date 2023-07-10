package dsaWithJava.functions.Stack;

//https://leetcode.com/problems/min-stack/description/

import java.util.ArrayList;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public static void main(String[] args) {

    }

    public void push(int val){
        stack.push(val);
        val = Math.min(val,minStack.isEmpty() ? val : minStack.peek());
        minStack.push(val);
    }
    public void pop(){
        stack.pop();
        minStack.pop();
    }
    public int top(){
        return stack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }
}
