package dsaWithJava.functions.Array;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(arr);
        System.out.println(ans);
    }

    static int removeDuplicates(int[] nums) {
        int pos = 1;
        int counter = 0;
        int[] correct = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            if(correct[pos-1] == nums[i]){
                continue;
            }
            if(i<1){
                correct[pos-1] = nums[i];
            }else {
                correct[pos] = nums[i];
                pos++;
            }

        }

        int ans = pos;

        for (int i = 0; i < ans; i++) {
            nums[i] = correct[i];
        }

        return ans;
    }

}
