package dsaWithJava.functions.Stack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
        int target = 10;
        int[] pos = {6,8};
        int[] speed = {3,2};
        int ans = carFleet(target,pos,speed);
        System.out.println(ans);
    }

    static int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stk = new Stack<>();
        //Combine the two arrays.
        int[][] combine = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            combine[i][0] = position[i];
            combine[i][1] = speed[i];
        }
        //Sort the combined array on the basis of position.
        Arrays.sort(combine, Comparator.comparingInt(o ->o[0]));
        //Iterating the array from the last to get the car near the finish line and calculate the time respectively
        for (int i = position.length-1; i >=0; i--) {
            // we need to typecast otherwise the solution will be converted to int because of target
            double currentTime = (double)(target - combine[i][0]) / combine[i][1];
            if (!stk.isEmpty() && currentTime <= stk.peek()){
                continue;
            }else {
                stk.push(currentTime);
            }
        }
        return stk.size();
    }

}
