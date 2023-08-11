package dsaWithJava.functions.Array;
//https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1};
        int sol = longestConsecutive(arr);
        System.out.println(sol);
    }


    static int longestConsecutive3(int[] nums){
        //optimal Solution O(N)
        Set<Integer> map = new HashSet<>();
        int res = 0;
        //Entering the values in the set
        for (int i:nums) {
            map.add(i);
        }
        for (int i:nums){
            int max = 1,prevVal=i-1,nextVal=i+1;
            while (map.contains(prevVal)){
                max++;
                map.remove(prevVal--);
            }
            while (map.contains(nextVal)){
                max++;
                map.remove(nextVal++);
            }
            res = Math.max(max,res);
        }
        return res;
    }
    static int longestConsecutive2(int[] nums){
        //optimal Solution O(N)
        Set<Integer> map = new HashSet<>();
        //Entering the values in the set
        for (int i:nums) {
            map.add(i);
        }
        int max = 0;
        for (int i:nums){
            if (!map.contains(i-1)){
                int currentNum = i;
                int count = 1;
                while (map.contains(currentNum+1)){
                    currentNum++;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
    static int longestConsecutive(int[] nums) {
        //Brute force Approach
        //sort the array
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for (int i = 0; i < nums.length-1; i++) {
            //if they are consecutive increase count and store in max
            if (nums[i]+1==nums[i+1]){
                count++;
                max = Integer.max(max,count);
            } else if (nums[i]==nums[i+1]) {
                //If the consecutive numbers are same continue the count
                continue;
            }else {
                //If the consecutive link break initialize the count to 1
                count = 1;
            }
        }
        //If the array is empty return 0;
        if (nums.length==0){
            return 0;
        }
        return max;
    }

}
