package dsaWithJava.functions.Array;
//https://leetcode.com/problems/trapping-rain-water/description/

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int sol = trap(arr);
        System.out.println(sol);
    }

    static int trap(int[] height) {
        int count = 0;
        int[] leftMax = new int[height.length];
        int left = 0;
        int[] rightMax = new int[height.length];
        int right = 0;
        //Updating the values of Leftmax for each index of height.
        for (int i = 0; i < height.length; i++) {
            leftMax[i] = left;
            left = Math.max(left,height[i]);
        }
        //Updating the values of rightMax for each index of height.
        for (int i = height.length-1; i >=0 ; i--) {
            rightMax[i] = right;
            right = Math.max(right,height[i]);
        }
        //Now iterate over the array and check the left and right max and calculate the trapped water at index i.
        for (int i = 0; i < height.length; i++) {
            int ans = Math.min(leftMax[i],rightMax[i])-height[i];
            if(ans>0){
                count = count+ans;
            }
        }
        return count;
    }

}
