package dsaWithJava.functions.Array;

import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class NumberSmallerThanCurrentNumber {
    public static void main(String[] args) {
    int[] nums = {7,7,7,7};
    int[] ans =  smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];

        for (int i = 0; i < length; i++) {
            int spotlight = nums[i];
            int count = 0;
            for (int j = 0; j < length; j++) {

                if(spotlight > nums[j]){
                    count++;
                }
            }
            ans[i] = count;
        }
        
        return ans;
    }
}
