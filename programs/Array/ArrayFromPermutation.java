package dsaWithJava.functions.Array;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int nums[] = {3,1,2,10,1};
//        int[] ans = buildArray(nums);
        int[] ans = runningSum(nums);
//        int[] res = getConcatenation(nums);
        PrintAns(ans);
    }

    private static void PrintAns(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//    https://leetcode.com/problems/build-array-from-permutation/description/
    static int[] buildArray(int[] arr){
        int length = arr.length;
        int[] ans = new int[length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]] ;
        }

        return ans;
    }

//    https://leetcode.com/problems/concatenation-of-array/
    static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] Ans = new int[2*length];
        int[] ans1 = new int[length];
        int[] ans2 = new int[length];
        for (int i = 0; i < nums.length; i++) {
            ans1[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            ans2[i] = nums[i];
        }
        for (int i = 0; i < Ans.length; i++) {
            if(i<Ans.length/2){
            Ans[i] = ans1[i];
            }else {
                Ans[i] = ans2[i-length];
            }
        }
        return Ans;
    }

//    https://leetcode.com/problems/running-sum-of-1d-array/description/
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            temp = 0;
            while(index >= 0){
                temp = temp + nums[index];
                index--;
            }
            ans[i] = temp;
        }

        return ans;
    }
}
