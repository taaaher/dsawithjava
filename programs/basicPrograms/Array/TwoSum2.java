package dsaWithJava.functions.Array;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        int tar = -1;
        int[] sol = twoSum(arr,tar);
        System.out.println(Arrays.toString(sol));
    }

    static int[] twoSum(int[] numbers, int target) {
//        Using two pointer. In question it is stated that the array is sorted and in non-decreasing order.
        int[] ans = new int[2];
        ans[0] = -1; ans[1] = -1;
        int len = numbers.length;
        int l = 0;
        int r = len-1;
        while (l<r){
            if (numbers[l]+numbers[r] > target){
                r--;
                continue;
            }
            if (numbers[l]+numbers[r] < target){
                l++;
                continue;
            }
            if(numbers[l]+numbers[r] == target){
//                adding extra 1 because in the problem index starts from 1.
                ans[0] = l+1;
                ans[1] = r+1;
                return ans;
            }
        }
        return ans;
    }
}
