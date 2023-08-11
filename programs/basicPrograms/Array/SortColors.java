package dsaWithJava.functions.Array;

import java.util.Arrays;
//https://leetcode.com/problems/sort-colors/

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors3(arr);
    }

    static void sortColors3(int[] nums){
        //National Dutch Flag Algorithm.
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        while (mid<=high){
            if (nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else {
                swap(nums,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    static void sortColors2(int[] nums){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int itr = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                count0++;
            }
            if (nums[i]==1){
                count1++;
            }
            if (nums[i]==2){
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            nums[itr]=0;
            itr++;
        }
        for (int i = 0; i < count1; i++) {
            nums[itr]=1;
            itr++;
        }
        for (int i = 0; i < count2; i++) {
            nums[itr]=2;
            itr++;
        }
    }

    static void sortColors(int[] nums) {
        //Brute Force TC O(N*LogN)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(nums[j]>nums[j-1]){
                    break;
                }
                swap(nums,j,j-1);
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

}
