package dsaWithJava.functions.Array;

//https://leetcode.com/problems/number-of-good-pairs/description/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
    int[] nums = {1,2,3};
    int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }

    static int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i] == nums[j]){
                    res++;
                }
            }
        }

        return res;
    }
}
