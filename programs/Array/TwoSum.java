package dsaWithJava.functions.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/two-sum/

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,3};
        int target = 6;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoSum2(int[] nums, int target){
        //Optimal Solution uses Hashmap and takes O(NlogN) time
        Map<Integer,Integer> numsToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsToIndex.containsKey(target-nums[i])){
                return new int[] {numsToIndex.get(target-nums[i]),i};
            }
            numsToIndex.put(nums[i],i);
        }
        return new int[] {};
    }
    static int[] twoSum(int[] nums, int target) {
        //Brute force O(N2)
        int[] ans = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i]+nums[j];
                if(sum == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

}
