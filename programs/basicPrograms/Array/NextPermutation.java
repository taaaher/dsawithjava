package dsaWithJava.functions.Array;

import java.util.Arrays;

//https://leetcode.com/problems/next-permutation/
public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        nextPermutation(arr);
    }

    static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;

        //Find the partition
        for (int i = n-2; i >= 0; i--) {
            if (nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }

        if (idx==-1){
            int start = 0;
            int end = n-1;
            int mid = (start+end)/2;
            while(start<=mid){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(nums));
            return;
        }

        //Swap the smallest which is greater than idx and swap them.
        for (int i = n-1; i > idx; i--) {
            if (nums[i]>nums[idx]){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[idx] = temp;
                break;
            }
        }

        //Reverse the right hand side of the partition
        int start = idx+1;
        int end = n-1;
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(nums));
    }

}
