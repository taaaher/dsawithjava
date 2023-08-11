package dsaWithJava.functions.Array;

//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,-1};
        int sol = maxSubArray(arr);
        System.out.println(sol);
    }

    static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
//        Kedane's Algorithm.
        for (int i : nums) {
                sum = sum + i;
                max = Math.max(max,sum);
                if(sum < 0){
                sum = 0;
                }
        }
        return max;
    }

}
