package dsaWithJava.functions.BitManipulation;

//https://leetcode.com/problems/single-number/
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,4};
        int sol = singleNumber(nums);
        System.out.println(sol);
    }
    static int singleNumber(int[] nums) {
        int ans = 0;
        for(int n : nums){
            ans = ans^n;
        }
        return ans;
    }
}
