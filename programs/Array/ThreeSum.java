package dsaWithJava.functions.Array;

//https://leetcode.com/problems/3sum/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> sol = threeSum(arr);
        System.out.println(sol);
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //Sort the array
        Arrays.sort(nums);
        int target = 0;
        for (int i = 0; i < nums.length-2; i++) {
//            checking for duplicate adjacent elements.
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){
                int l = i+1;
                int r = nums.length-1;
                while(l<r){
                    //If the pair found add to list.
//                    if pair found store in list.
                    if(nums[i] == target-(nums[l]+nums[r])){
                        res.add(Arrays.asList(nums[i],nums[l],nums[r]));
//                        if l and l+1 are same element than increment l
                        while (l<r && nums[l]==nums[l+1]){
                            l++;
                        }
//                        if r and r-1 are same then decrement r.
                        while (l<r && nums[r]==nums[r-1]){
                            r--;
                        }
                        l++;
                        r--;
                    } else if (nums[i] < target-(nums[r]+nums[l])) {
                        l++;
                    }else {
                        r--;
                    }
                }
            }
        }

        return res;
    }

}
