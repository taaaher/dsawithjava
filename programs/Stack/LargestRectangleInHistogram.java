package dsaWithJava.functions.Stack;

//https://leetcode.com/problems/largest-rectangle-in-histogram/

import java.util.Stack;

public class LargestRectangleInHistogram {
    class Pair{
        int a;
        int b;
    }
    public static void main(String[] args) {
        int[] arr = {9,0};
        int ans = largestRectangleArea(arr);
        System.out.println(ans);
    }

    static int largestRectangleArea(int[] heights) {
//        The errors will be removed from the online editor for the problem portals.
        int area = 0, n = heights.length;
        int start;
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        for(int i=0;i<heights.length;i++){
            int curHt =heights[i];
            start = i;
            while(!stack.isEmpty() && stack.peek().getValue() > curHt){
                Pair<Integer,Integer> pair = stack.pop();
                int index = pair.getKey();
                int h = pair.getValue();
                area = Math.max(area, h * (i - index));
                start = index;
            }
            stack.push(new Pair(start,curHt));
        }

        while(!stack.isEmpty()){
            Pair<Integer,Integer> pair = stack.pop();
            int index = pair.getKey();
            int h = pair.getValue();
            area = Math.max(area, h * (n - index));
        }
        return area;
        }
    }

}
