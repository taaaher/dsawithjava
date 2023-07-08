package dsaWithJava.functions.Array;
//https://leetcode.com/problems/product-of-array-except-self/description/
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] sol = productExceptSelf2(arr);
        System.out.println(Arrays.toString(sol));
    }

    static int[] productExceptSelf2(int[] nums) {
//        TC : O(N) SC : O(1)
//        Optimized Solution wihtout using extra space.
//        initialize a new array of size nums
        int[] ans = new int[nums.length];
        int prefix = 1, postfix = 1;
        //Iterate nums from left to store the values of prefix in ans.
        ans[0] = prefix;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix;
            prefix = prefix*nums[i];
        }
//        Iterate again but from right to get the values and multiply with prefix in the output.
        for (int i = nums.length-1; i >=0; i--) {
            ans[i] = ans[i]*postfix;
            postfix = postfix*nums[i];
        }
        return ans;
    }

    static int[] productExceptSelf(int[] nums) {
//        TC : O(N) SC : O(N)
//        initialize a new array of size nums
        int[] ans = new int[nums.length];
        int start = 1, end = 1;
//       Maintain a prefix array
        int[] prefix = new int[nums.length];
        prefix[0] = start;
        int[] postfix = new int[nums.length];
        postfix[postfix.length-1] = end;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1]*nums[i-1];
        }
//    Maintain a postfix array
        for (int i = nums.length-2; i >= 0; i--) {
            postfix[i] = postfix[i+1]*nums[i+1];
        }
//    for each position get the product of prefix[i-1] and postfix[i+1]
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix[i]*postfix[i];
        }
        return ans;
    }

}
