package dsaWithJava.functions.Stack;

//https://leetcode.com/problems/daily-temperatures/description/
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {

    }

    static int[] dailyTemperatures(int[] temperatures) {
        //Using Monotonic Decreasing Stack
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int currDay = 0; currDay < temperatures.length; currDay++) {
            while(!stk.isEmpty() && temperatures[currDay] > temperatures[stk.peek()]){
                int prevDay = stk.pop();
                ans[currDay] = currDay -prevDay;
            }
            stk.add(currDay);
        }
        return ans;
    }

}
