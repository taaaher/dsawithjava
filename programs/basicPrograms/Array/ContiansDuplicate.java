package dsaWithJava.functions.Array;

//https://leetcode.com/problems/contains-duplicate/description/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContiansDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean sol = containsDuplicate(arr);
        System.out.println(sol);
    }


    static boolean containsDuplicate2(int[] nums){
        //using set
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(unique.contains(nums[i])){
                return true;
            }
            unique.add(nums[i]);
        }
        return false;
    }

    static boolean containsDuplicate(int[] nums) {
        //Using sorting
        Arrays.sort(nums);
        boolean ans = false;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return ans;
    }

}
