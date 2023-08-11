package dsaWithJava.functions.SortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums= {1};
        List<Integer> v;
        int d;
        int p;
//        cyclicSort(nums);
//        System.out.println(Arrays.toString(nums));
//        v = missingNumber(nums);
//        System.out.println(v);

//       v = findDisappearedNumbers(nums);
//        System.out.println(v);
//        d = findDuplicate(nums);
//        System.out.println(d);

//        v = findAllDuplicates(nums);
//        System.out.println(v);

//        int[] e = findErrorNums(nums);
//        System.out.println(Arrays.toString(e));

        p = firstMissingPositive(nums);
        System.out.println(p);

    }

//    https://leetcode.com/problems/first-missing-positive/description/
    static int firstMissingPositive(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] <= 0){
                i++;
            } else if ( nums[i]<nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct );
            }else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return i+112;
    }


//    https://leetcode.com/problems/set-mismatch/
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        int ans = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index+1};
            }
        }

        return new int[]{-1, -1};
    }


//    https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
    static List<Integer> findAllDuplicates(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i , correct);
            }else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
         return ans;
    }

//    https://leetcode.com/problems/find-the-duplicate-number/description/
    static int findDuplicate(int[] nums){
        int[] arr = nums;
//        System.out.println(Arrays.toString(arr));
        int i = 0;
        while(i< arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(arr[index] != index+1){
                return arr[index];
            }
        }
        return 0;
    }

    static void cyclicSort(int[] arr){
        // check
       int i = 0;
            while(i < arr.length){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else {
                    i++;
                }
            }
        // swap
        // move
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


// https://leetcode.com/problems/missing-number/description/
     static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] == 0){
                i++;
                continue;
            }
            int correct = nums[i] - 1;
            if(nums[i] != correct){
                swap(nums, i, correct);
            }else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == 0){
                return (j+1);
            }
        }
        return 0;
    }


// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    static List<Integer> findDisappearedNumbers(int[] nums){
        //check
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }
            }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

}
