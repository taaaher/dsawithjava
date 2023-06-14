package dsaWithJava.functions.Array;

public class SortColors {
    public static void main(String[] args) {

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
        nums[j] = nums[j-1];
        nums[j-1] = temp;
    }

}
