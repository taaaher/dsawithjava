package dsaWithJava.functions.Array;

public class ReversePairs {
    public static void main(String[] args) {
        int[] arr = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int sol = reversePairs(arr);
        System.out.println(sol);
    }

    static int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                long first = nums[i];
                long second = 2*nums[j];
                if((long)first>(long)second){
                    count++;
                }
            }
        }
        return count;
    }

}
