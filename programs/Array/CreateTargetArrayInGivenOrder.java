package dsaWithJava.functions.Array;

import java.util.ArrayList;
import java.util.Arrays;


//https://leetcode.com/problems/create-target-array-in-the-given-order/description/

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = createTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        //This was my trial and error code

//        int[] target = new int[nums.length];
//        for (int i = 0; i < index.length; i++) {
//            if(target[index[i]] == 0){
//                target[index[i]] = nums[i];
//            }else {
//                for (int j = i; j < index[i] ; j--) {
//                    swap(target, j, j+1);
//                }
//                target[index[i]] = nums[i];
//            }
//        }
//        return target;

        // This problem will require use of ArrayList

        ArrayList<Integer> arr = new ArrayList<>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = arr.get(i);
        }
        return  ans;
    }

    static void swap(int[] target, int first, int second){
        int temp = target[first];
        target[first] = target[second];
        target[second] = temp;
    }
}
