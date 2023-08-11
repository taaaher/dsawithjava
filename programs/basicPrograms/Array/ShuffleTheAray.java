package dsaWithJava.functions.Array;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheAray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int n = nums.length/2;
        int[] ans = shufle(nums, n);
        printAns(ans);
    }

     static int[] shufle(int[] nums, int n) {
        int length = nums.length;
        int[] ans = new int[length];
         for (int index = 0, j=n, i=0;  index < nums.length; index++) {
             if(index%2 == 0){
                 ans[index] = nums[i];
                 i++;
             }else {
                 ans[index] = nums[j];
                 j++;
             }
         }
         return ans;
    }
    static void printAns(int[] ans) {
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
